package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FxAreaMapperEx {

    List<FxArea> selectByConditionFxArea(
            @Param("areaName") String areaName,
            @Param("areaId") Integer areaId,
            @Param("areaParentId") Integer areaParentId,
            @Param("areZip") String areaZip,
            @Param("offset")Integer offset,
            @Param("rows") Integer rows);

    Long countsByFxArea(@Param("areaName") String areaName,
                        @Param("areaId") Integer areaId,
                        @Param("areaParentId") Integer areaParentId,
                        @Param("areZip") String areaZip);
}
