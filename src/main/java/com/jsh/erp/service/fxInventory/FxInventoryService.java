package com.jsh.erp.service.fxInventory;

import com.jsh.erp.datasource.entities.FxArea;
import com.jsh.erp.datasource.entities.FxSupplier;
import com.jsh.erp.datasource.entities.FxSupplierExample;
import com.jsh.erp.datasource.mappers.FxInventoryMapper;
import com.jsh.erp.datasource.mappers.FxInventoryMapperEx;
import com.jsh.erp.datasource.mappers.FxSupplierMapper;
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
    public List<FxArea> select(String supplierName,int offset, int rows){
        List<FxArea> list = null;
        try{
            //查supplierId
            String supplierIds = null;
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
                        suppliersSb.append(suppliers.get(i).getId());
                    }
                    supplierIds = suppliersSb.toString();
                }
            }

            if(StringUtil.isEmpty(supplierIds)){
                list = fxInventoryMapperEx.selectByCondition(supplierIds,offset,rows);
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
