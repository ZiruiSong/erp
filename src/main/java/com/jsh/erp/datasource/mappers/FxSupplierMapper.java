package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxSupplier;
import com.jsh.erp.datasource.entities.FxSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FxSupplierMapper {
    long countByExample(FxSupplierExample example);

    int deleteByExample(FxSupplierExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FxSupplier record);

    int insertSelective(FxSupplier record);

    List<FxSupplier> selectByExample(FxSupplierExample example);

    FxSupplier selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FxSupplier record, @Param("example") FxSupplierExample example);

    int updateByExample(@Param("record") FxSupplier record, @Param("example") FxSupplierExample example);

    int updateByPrimaryKeySelective(FxSupplier record);

    int updateByPrimaryKey(FxSupplier record);
}