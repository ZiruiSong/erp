package com.jsh.erp.service.fxArea;

import com.jsh.erp.datasource.entities.FxArea;
import com.jsh.erp.datasource.entities.FxAreaExample;
import com.jsh.erp.datasource.mappers.FxAreaMapper;
import com.jsh.erp.datasource.mappers.FxAreaMapperEx;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.materialProperty.MaterialPropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FxAreaService {

    private Logger logger = LoggerFactory.getLogger(MaterialPropertyService.class);

    @Resource
    private FxAreaMapper fxAreaMapper;

    @Resource
    private FxAreaMapperEx fxAreaMapperEx;

    public List<FxArea> select(Integer areaId,String areaName,Integer areaParentId,String areaZip,int offset, int rows){
        List<FxArea> list = null;
        try{
            list = fxAreaMapperEx.selectByConditionFxArea(areaName,areaId,areaParentId,areaZip,offset,rows);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return list;
    }

    public Long countsByFxArea(Integer areaId,String areaName,Integer areaParentId,String areaZip){
        Long result = null;
        try{

            result = fxAreaMapperEx.countsByFxArea(areaName,areaId,areaParentId,areaZip);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return  result;
    }
}
