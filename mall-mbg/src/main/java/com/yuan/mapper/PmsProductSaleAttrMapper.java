package com.yuan.mapper;

import com.yuan.model.PmsProductSaleAttr;
import com.yuan.model.PmsProductSaleAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductSaleAttrMapper {
    long countByExample(PmsProductSaleAttrExample example);

    int deleteByExample(PmsProductSaleAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductSaleAttr record);

    int insertSelective(PmsProductSaleAttr record);

    List<PmsProductSaleAttr> selectByExample(PmsProductSaleAttrExample example);

    PmsProductSaleAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProductSaleAttr record, @Param("example") PmsProductSaleAttrExample example);

    int updateByExample(@Param("record") PmsProductSaleAttr record, @Param("example") PmsProductSaleAttrExample example);

    int updateByPrimaryKeySelective(PmsProductSaleAttr record);

    int updateByPrimaryKey(PmsProductSaleAttr record);
}