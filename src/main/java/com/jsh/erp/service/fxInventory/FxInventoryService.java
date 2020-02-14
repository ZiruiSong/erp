package com.jsh.erp.service.fxInventory;

import com.jsh.erp.datasource.mappers.FxInventoryMapper;
import com.jsh.erp.datasource.mappers.FxInventoryMapperEx;
import com.jsh.erp.datasource.mappers.FxSupplierMapper;
import com.jsh.erp.datasource.vo.FxInventoryVo;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.materialProperty.MaterialPropertyService;
import com.jsh.erp.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        List<FxInventoryVo> list = null;
        try{
            if(!StringUtil.isEmpty(supplierName)){
                list = fxInventoryMapperEx.selectBySupplierName(supplierName,offset,rows);
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
