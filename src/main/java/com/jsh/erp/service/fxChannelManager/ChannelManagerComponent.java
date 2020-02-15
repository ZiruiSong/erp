package com.jsh.erp.service.fxChannelManager;


import com.jsh.erp.service.ICommonQuery;
import com.jsh.erp.utils.Constants;
import com.jsh.erp.utils.QueryUtils;
import com.jsh.erp.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service(value="channelManager_component")
@ChannelManagerResource
public class ChannelManagerComponent implements ICommonQuery {
    @Resource
    private ChannelManagerService channelManagerService;

    @Override
    public Object selectOne(Long id) throws Exception {
        return null;
    }

    @Override
    public List<?> select(Map<String, String> map) throws Exception {
        return getSupplierList(map);
    }

    private List<?> getSupplierList(Map<String,String> map){
        String search = map.get(Constants.SEARCH);
        String channelName = StringUtil.getInfo(search, "searchChannelName");
        String channelUser = StringUtil.getInfo(search,"searchChannelUser");
        Long channelUserId = null;
        if(StringUtil.isEmpty(channelUser)){
            channelName = null;
        }
        if(StringUtil.isNotEmpty(channelUser)){
            channelUserId = Long.parseLong(channelUser);
        }
        return channelManagerService.select(channelName,channelUserId, QueryUtils.offset(map),QueryUtils.rows(map));
    }

    @Override
    public Long counts(Map<String, String> map) throws Exception {
        String search = map.get(Constants.SEARCH);
        //渠道名称
        String channelName = StringUtil.getInfo(search, "searchChannelName");
        //渠道负责人
        String channelUser = StringUtil.getInfo(search,"searchChannelUser");
        Long channelUserId = null;
        if(StringUtil.isEmpty(channelUser)){
            channelName = null;
        }
        if(StringUtil.isNotEmpty(channelUser)){
            channelUserId = Long.parseLong(channelUser);
        }
        return channelManagerService.counts(channelName,channelUserId);
    }

    @Override
    public int insert(String beanJson, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int update(String beanJson, Long id, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int batchDelete(String ids, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int checkIsNameExist(Long id, String name) throws Exception {
        return 0;
    }
}