package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FxInventoryMapperEx {
    List<FxArea> selectByCondition(
            @Param("supplierIds") String supplierIds,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long counts(@Param("supplierName") String supplierName);
}
