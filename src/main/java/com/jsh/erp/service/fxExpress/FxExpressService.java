package com.jsh.erp.service.fxExpress;

import com.jsh.erp.datasource.entities.FxExpress;
import com.jsh.erp.datasource.mappers.FxExpressMapper;
import com.jsh.erp.datasource.mappers.FxExpressMapperEx;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.materialProperty.MaterialPropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FxExpressService {

    private Logger logger = LoggerFactory.getLogger(MaterialPropertyService.class);


    @Resource
    private FxExpressMapper fxExpressMapper;

    @Resource
    private FxExpressMapperEx fxExpressMapperEx;

    public List<FxExpress> select(String expressName,int offset,int rows){
        List<FxExpress> result = null;
        try {

            result = fxExpressMapperEx.selectByConditionFxExpress(expressName,offset,rows);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return result;
    }

    public Long countsByFxExpress(String expressName){
        Long result = null;
        try{
            result = fxExpressMapperEx.countsByFxExpress(expressName);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return result;
    }
}
