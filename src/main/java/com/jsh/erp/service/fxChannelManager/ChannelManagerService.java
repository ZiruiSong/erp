package com.jsh.erp.service.fxChannelManager;

import com.jsh.erp.datasource.mappers.FxSupplierMapper;
import com.jsh.erp.datasource.mappers.FxSupplierMapperEx;
import com.jsh.erp.datasource.vo.ChannelManagerVo2List;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.log.LogService;
import com.jsh.erp.service.materialProperty.MaterialPropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import static com.jsh.erp.utils.Tools.getCenternTime;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ChannelManagerService {

    private Logger logger = LoggerFactory.getLogger(MaterialPropertyService.class);

    @Resource
    private LogService logService;

    @Resource
    private FxSupplierMapper fxSupplierMapper;

    @Resource
    private FxSupplierMapperEx fxSupplierMapperEx;
    /**
     * 查询
     * @return
     */
    public List<ChannelManagerVo2List> select(String channelName, Long channelUserId, int offset, int rows){
        List<ChannelManagerVo2List> list = null;
        try{
            list = fxSupplierMapperEx.selectByCondition(channelName,channelUserId,offset,rows);
            for(ChannelManagerVo2List channelManagerVo2List:list){
                channelManagerVo2List.setCreateTimeStr(getCenternTime(channelManagerVo2List.getCreateTime()));
            }
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return list;
    }

    public Long counts(String channelName,Long channelUserId){
        Long result = null;
        try{
            result = fxSupplierMapperEx.counts(channelName,channelUserId);
        }catch (Exception e){
            JshException.readFail(logger,e);
        }
        return  result;
    }
}
