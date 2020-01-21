package com.jsh.erp.service.fxExpress;

import com.alibaba.fastjson.JSONObject;
import com.jsh.erp.constants.BusinessConstants;
import com.jsh.erp.datasource.entities.FxExpress;
import com.jsh.erp.datasource.entities.FxExpressExample;
import com.jsh.erp.datasource.mappers.FxExpressMapper;
import com.jsh.erp.datasource.mappers.FxExpressMapperEx;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.log.LogService;
import com.jsh.erp.service.materialProperty.MaterialPropertyService;
import com.jsh.erp.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class FxExpressService {

    private Logger logger = LoggerFactory.getLogger(MaterialPropertyService.class);


    @Resource
    private FxExpressMapper fxExpressMapper;

    @Resource
    private FxExpressMapperEx fxExpressMapperEx;

    @Resource
    private LogService logService;

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

    public int checkIsExist(String expressName){
        FxExpressExample example = new FxExpressExample();
        FxExpressExample.Criteria criteria = example.createCriteria();
        criteria.andExpressNameEqualTo(expressName);
        List<FxExpress> list = null;
        try{
            list = fxExpressMapper.selectByExample(example);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return list==null?0:list.size();
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int insertFxExpress(String beanJson, HttpServletRequest request){
        FxExpress fxExpress = JSONObject.parseObject(beanJson,FxExpress.class);
        int result = 0;
        try{
            result = fxExpressMapper.insertSelective(fxExpress);
            logService.insertLog("快递", BusinessConstants.LOG_OPERATION_TYPE_ADD, request);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return result;
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int updateFxExpress(String beanJson, Long id, HttpServletRequest request){
        FxExpress fxExpress = JSONObject.parseObject(beanJson,FxExpress.class);
        fxExpress.setId(id);
        int result = 0;

        try{
            result = fxExpressMapper.updateByPrimaryKeySelective(fxExpress);
            logService.insertLog("快递",
                    new StringBuffer(BusinessConstants.LOG_OPERATION_TYPE_EDIT).append(id).toString(), request);
        }catch (Exception e){

        }
        return result;
    }

    /**
     * 正常删除
     * @param ids
     * @return
     */
    public int deleteExpressByIdsNormal(String ids) {
        int deleteTotal = 0;
        if(StringUtil.isEmpty(ids)){
            return deleteTotal;
        }
        deleteTotal = deleteExpressByIds(ids);
        return deleteTotal;
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int deleteExpressByIds(String ids) {
        int result = 0;
        try {
            logService.insertLog("快递",
                    new StringBuffer(BusinessConstants.LOG_OPERATION_TYPE_DELETE).append(ids).toString(),
                    ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest());
            String[] idArr = ids.split(",");
            result = fxExpressMapperEx.deleteExpressByIds(idArr);
        } catch (Exception e) {
            JshException.writeFail(logger, e);
        }
        return result;
    }
}
