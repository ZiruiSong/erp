package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.vo.ChannelManagerVo2List;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FxSupplierMapperEx {
    List<ChannelManagerVo2List> selectByCondition(
            @Param("channelName") String channelName,
            @Param("channelUserId") Long channelUserId,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long counts(@Param("channelName") String supplierName
            ,@Param("channelUserId") Long channelUserId);
}
