package com.yuan.mapper;

import com.yuan.model.PmsSkuAttrValue;
import com.yuan.model.PmsSkuAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuAttrValueMapper {
    long countByExample(PmsSkuAttrValueExample example);

    int deleteByExample(PmsSkuAttrValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsSkuAttrValue record);

    int insertSelective(PmsSkuAttrValue record);

    List<PmsSkuAttrValue> selectByExample(PmsSkuAttrValueExample example);

    PmsSkuAttrValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsSkuAttrValue record, @Param("example") PmsSkuAttrValueExample example);

    int updateByExample(@Param("record") PmsSkuAttrValue record, @Param("example") PmsSkuAttrValueExample example);

    int updateByPrimaryKeySelective(PmsSkuAttrValue record);

    int updateByPrimaryKey(PmsSkuAttrValue record);
}