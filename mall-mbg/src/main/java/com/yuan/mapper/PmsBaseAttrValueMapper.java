package com.yuan.mapper;

import com.yuan.model.PmsBaseAttrValue;
import com.yuan.model.PmsBaseAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBaseAttrValueMapper {
    long countByExample(PmsBaseAttrValueExample example);

    int deleteByExample(PmsBaseAttrValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseAttrValue record);

    int insertSelective(PmsBaseAttrValue record);

    List<PmsBaseAttrValue> selectByExample(PmsBaseAttrValueExample example);

    PmsBaseAttrValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByExample(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByPrimaryKeySelective(PmsBaseAttrValue record);

    int updateByPrimaryKey(PmsBaseAttrValue record);
}