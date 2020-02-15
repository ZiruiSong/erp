package com.jsh.erp.controller;

import com.jsh.erp.datasource.entities.FxInventory;
import com.jsh.erp.service.fxInventory.FxInventoryService;
import com.jsh.erp.utils.BaseResponseInfo;
import com.jsh.erp.utils.ExcelUtils;
import com.jsh.erp.utils.StringUtil;
import jxl.Sheet;
import jxl.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/fxInventory")
public class FxInventoryController {
    private Logger logger = LoggerFactory.getLogger(SupplierController.class);

    @Resource
    private FxInventoryService fxInventoryService;


    @PostMapping(value = "/importExcel")
    public void importExcelVendor(MultipartFile inventoryFile,
                                  HttpServletRequest request, HttpServletResponse response) {
        importFun(inventoryFile);
        try {
            response.sendRedirect("../pages/fenxiao/fxInventory.html");
        } catch (IOException e) {
            System.out.println("重定向失败");
            e.printStackTrace();
        }
    }

    public BigDecimal parseBigDecimalEx(String str){
        if(!StringUtil.isEmpty(str)) {
            return new BigDecimal(str);
        } else {
            return null;
        }
    }

    public BaseResponseInfo importFun(MultipartFile inventoryFile){
        BaseResponseInfo info = new BaseResponseInfo();
        Map<String, Object> data = new HashMap<String, Object>();
        String message = "成功";
        try {
            Sheet src = null;
            //文件合法性校验
            try {
                Workbook workbook = Workbook.getWorkbook(inventoryFile.getInputStream());
                src = workbook.getSheet(0);
            } catch (Exception e) {
                message = "导入文件不合法，请检查";
                data.put("message", message);
                info.code = 400;
                info.data = data;
                return info;
            }
            //每行中数据顺序 货号、尺码、数量、
            List<FxInventory> sList = new ArrayList<>();
            for (int i = 1; i < src.getRows(); i++) {
                String goodsNbr = ExcelUtils.getContent(src,i,0);
                if(StringUtil.isEmpty(goodsNbr)){
                    break;
                }
                FxInventory inventory = new FxInventory();
                inventory.setInvenModel(goodsNbr);
                inventory.setOriSize(ExcelUtils.getContent(src,i,1));
                inventory.setInvenNum(Integer.parseInt(ExcelUtils.getContent(src,i,2)));
                inventory.setInvenAgio(parseBigDecimalEx(ExcelUtils.getContent(src, i, 3)));
                inventory.setTagPrice(parseBigDecimalEx(ExcelUtils.getContent(src, i, 4)));
                inventory.setSupplierId(106802L);
                inventory.setInvenSize(ExcelUtils.getContent(src,i,1));
                sList.add(inventory);
            }
            info = fxInventoryService.importExcel(sList);
        } catch (Exception e) {
            e.printStackTrace();
            message = "导入失败";
            info.code = 500;
            data.put("message", message);
            info.data = data;
        }
        return info;
    }
}
