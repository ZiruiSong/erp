package com.jsh.erp.service.fxInventory;

import com.jsh.erp.constants.BusinessConstants;
import com.jsh.erp.datasource.entities.FxInventory;
import com.jsh.erp.datasource.mappers.FxInventoryMapper;
import com.jsh.erp.datasource.mappers.FxInventoryMapperEx;
import com.jsh.erp.datasource.vo.FxInventoryVo;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.log.LogService;
import com.jsh.erp.service.materialProperty.MaterialPropertyService;
import com.jsh.erp.utils.BaseResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FxInventoryService {

    private Logger logger = LoggerFactory.getLogger(MaterialPropertyService.class);

    @Resource
    private LogService logService;

    @Resource
    private FxInventoryMapper fxInventoryMapper;

    @Resource
    private FxInventoryMapperEx fxInventoryMapperEx;

    /**
     * 查询
     * @return
     */
    public List<FxInventoryVo> select(String supplierName, int offset, int rows){
        List<FxInventoryVo> list = null;
        try{
            list = fxInventoryMapperEx.selectBySupplierName(supplierName,offset,rows);
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

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public BaseResponseInfo importExcel(List<FxInventory> mList) {
        try {
            logService.insertLog("库存导入",
                    new StringBuffer(BusinessConstants.LOG_OPERATION_TYPE_IMPORT).append(mList.size()).append(BusinessConstants.LOG_DATA_UNIT).toString(),
                    ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest());
        } catch (Exception e) {
            JshException.writeFail(logger,e);
//            e.printStackTrace();
        }
        BaseResponseInfo info = new BaseResponseInfo();
        Map<String, Object> data = new HashMap<String, Object>();
        try{
            for(FxInventory fxInventory:mList){
                fxInventoryMapper.insertSelective(fxInventory);
            }
            info.code = 200;
            data.put("message","成功");
        }catch (Exception e){
            e.printStackTrace();
            info.code = 500;
            data.put("message",e.getMessage());
        }
        info.data = data;
        return info;
    }
}
