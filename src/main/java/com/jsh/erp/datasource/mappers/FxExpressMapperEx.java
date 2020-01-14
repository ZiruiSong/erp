package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxExpress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FxExpressMapperEx {

    List<FxExpress> selectByConditionFxExpress(
            @Param("expressName") String expressName,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows
    );

    Long countsByFxExpress(
            @Param("expressName") String expressName
    );
}
