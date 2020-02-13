package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxInventory;
import com.jsh.erp.datasource.vo.FxInventoryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FxInventoryMapperEx {
    List<FxInventory> selectByCondition(
            @Param("supplierIds") String supplierIds,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long counts(@Param("supplierName") String supplierName);

    List<FxInventoryVo> selectBySupplierName(@Param("supplierName")String supplierName,
                                             @Param("offset") Integer offset,
                                             @Param("rows") Integer rows);
}
