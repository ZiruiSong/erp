package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxInventory;
import com.jsh.erp.datasource.entities.FxInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FxInventoryMapper {
    long countByExample(FxInventoryExample example);

    int deleteByExample(FxInventoryExample example);

    int deleteByPrimaryKey(Long invenId);

    int insert(FxInventory record);

    int insertSelective(FxInventory record);

    List<FxInventory> selectByExample(FxInventoryExample example);

    FxInventory selectByPrimaryKey(Long invenId);

    int updateByExampleSelective(@Param("record") FxInventory record, @Param("example") FxInventoryExample example);

    int updateByExample(@Param("record") FxInventory record, @Param("example") FxInventoryExample example);

    int updateByPrimaryKeySelective(FxInventory record);

    int updateByPrimaryKey(FxInventory record);
}