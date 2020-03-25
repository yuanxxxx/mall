package com.yuan.mapper;

import com.yuan.model.PmsProductSaleAttrValue;
import com.yuan.model.PmsProductSaleAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductSaleAttrValueMapper {
    long countByExample(PmsProductSaleAttrValueExample example);

    int deleteByExample(PmsProductSaleAttrValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductSaleAttrValue record);

    int insertSelective(PmsProductSaleAttrValue record);

    List<PmsProductSaleAttrValue> selectByExample(PmsProductSaleAttrValueExample example);

    PmsProductSaleAttrValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProductSaleAttrValue record, @Param("example") PmsProductSaleAttrValueExample example);

    int updateByExample(@Param("record") PmsProductSaleAttrValue record, @Param("example") PmsProductSaleAttrValueExample example);

    int updateByPrimaryKeySelective(PmsProductSaleAttrValue record);

    int updateByPrimaryKey(PmsProductSaleAttrValue record);
}