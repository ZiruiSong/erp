package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxArea;
import com.jsh.erp.datasource.entities.FxAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FxAreaMapper {
    long countByExample(FxAreaExample example);

    int deleteByExample(FxAreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(FxArea record);

    int insertSelective(FxArea record);

    List<FxArea> selectByExample(FxAreaExample example);

    FxArea selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") FxArea record, @Param("example") FxAreaExample example);

    int updateByExample(@Param("record") FxArea record, @Param("example") FxAreaExample example);

    int updateByPrimaryKeySelective(FxArea record);

    int updateByPrimaryKey(FxArea record);
}