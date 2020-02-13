package com.jsh.erp.service.fxInventory;

import com.jsh.erp.datasource.entities.FxInventory;
import com.jsh.erp.datasource.entities.FxSupplier;
import com.jsh.erp.datasource.entities.FxSupplierExample;
import com.jsh.erp.datasource.mappers.FxInventoryMapper;
import com.jsh.erp.datasource.mappers.FxInventoryMapperEx;
import com.jsh.erp.datasource.mappers.FxSupplierMapper;
import com.jsh.erp.datasource.vo.FxInventoryVo;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.materialProperty.MaterialPropertyService;
import com.jsh.erp.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FxInventoryService {

    private Logger logger = LoggerFactory.getLogger(MaterialPropertyService.class);

    @Resource
    private FxInventoryMapper fxInventoryMapper;

    @Resource
    private FxInventoryMapperEx fxInventoryMapperEx;

    @Resource
    private FxSupplierMapper fxSupplierMapper;

    /**
     * 查询
     * @return
     */
    public List<FxInventoryVo> select(String supplierName, int offset, int rows){
        List<FxInventoryVo> list = new ArrayList<>();
        try{
            //查supplierId
            String supplierIds = null;
            Map<Long,String> supplierIdAndNameMap = new HashMap<>();
            if(!StringUtil.isEmpty(supplierName)){
                FxSupplierExample supplierExample = new FxSupplierExample();
                supplierExample.createCriteria().andSupplierNameLike(supplierName);
                List<FxSupplier> suppliers = fxSupplierMapper.selectByExample(supplierExample);
                if(null == suppliers || suppliers.isEmpty()){
                    System.out.println("渠道不存在！！！");
                    return null;
                }else{
                    StringBuffer suppliersSb = new StringBuffer();
                    for (int i=0;i<suppliers.size();i++) {
                        if(0!=i){
                            suppliersSb.append(",");
                        }
                        supplierIdAndNameMap.put(suppliers.get(i).getId(),suppliers.get(i).getSupplierName());
                        suppliersSb.append(suppliers.get(i).getId());
                    }
                    supplierIds = suppliersSb.toString();
                }
            }

            if(!StringUtil.isEmpty(supplierIds)){
                List<FxInventory> fxInventories = fxInventoryMapperEx.selectByCondition(supplierIds,offset,rows);
                for (FxInventory fxInventory:fxInventories) {
                    FxInventoryVo fxInventoryVo = new FxInventoryVo();
                    BeanUtils.copyProperties(fxInventory,fxInventoryVo);
                    fxInventoryVo.setSupplierName(supplierIdAndNameMap.get(fxInventory.getSupplierId()));
                    list.add(fxInventoryVo);
                }

            }
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return list;
    }

    public Long counts(String supplierName){
        Long result = null;
        try{
            result = fxInventoryMapperEx.counts(supplierName);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return  result;
    }
}
