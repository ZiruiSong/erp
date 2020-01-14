package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.FxExpress;
import com.jsh.erp.datasource.entities.FxExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FxExpressMapper {
    long countByExample(FxExpressExample example);

    int deleteByExample(FxExpressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FxExpress record);

    int insertSelective(FxExpress record);

    List<FxExpress> selectByExample(FxExpressExample example);

    FxExpress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FxExpress record, @Param("example") FxExpressExample example);

    int updateByExample(@Param("record") FxExpress record, @Param("example") FxExpressExample example);

    int updateByPrimaryKeySelective(FxExpress record);

    int updateByPrimaryKey(FxExpress record);
}