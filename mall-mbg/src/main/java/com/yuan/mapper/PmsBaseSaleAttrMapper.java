package com.yuan.mapper;

import com.yuan.model.PmsBaseSaleAttr;
import com.yuan.model.PmsBaseSaleAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBaseSaleAttrMapper {
    long countByExample(PmsBaseSaleAttrExample example);

    int deleteByExample(PmsBaseSaleAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseSaleAttr record);

    int insertSelective(PmsBaseSaleAttr record);

    List<PmsBaseSaleAttr> selectByExample(PmsBaseSaleAttrExample example);

    PmsBaseSaleAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsBaseSaleAttr record, @Param("example") PmsBaseSaleAttrExample example);

    int updateByExample(@Param("record") PmsBaseSaleAttr record, @Param("example") PmsBaseSaleAttrExample example);

    int updateByPrimaryKeySelective(PmsBaseSaleAttr record);

    int updateByPrimaryKey(PmsBaseSaleAttr record);
}