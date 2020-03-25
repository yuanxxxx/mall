package com.yuan.mapper;

import com.yuan.model.PmsBaseCatalog3;
import com.yuan.model.PmsBaseCatalog3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBaseCatalog3Mapper {
    long countByExample(PmsBaseCatalog3Example example);

    int deleteByExample(PmsBaseCatalog3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseCatalog3 record);

    int insertSelective(PmsBaseCatalog3 record);

    List<PmsBaseCatalog3> selectByExample(PmsBaseCatalog3Example example);

    PmsBaseCatalog3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsBaseCatalog3 record, @Param("example") PmsBaseCatalog3Example example);

    int updateByExample(@Param("record") PmsBaseCatalog3 record, @Param("example") PmsBaseCatalog3Example example);

    int updateByPrimaryKeySelective(PmsBaseCatalog3 record);

    int updateByPrimaryKey(PmsBaseCatalog3 record);
}