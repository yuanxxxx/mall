package com.yuan.mapper;

import com.yuan.model.PmsBaseAttrInfo;
import com.yuan.model.PmsBaseAttrInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBaseAttrInfoMapper {
    long countByExample(PmsBaseAttrInfoExample example);

    int deleteByExample(PmsBaseAttrInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseAttrInfo record);

    int insertSelective(PmsBaseAttrInfo record);

    List<PmsBaseAttrInfo> selectByExample(PmsBaseAttrInfoExample example);

    PmsBaseAttrInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsBaseAttrInfo record, @Param("example") PmsBaseAttrInfoExample example);

    int updateByExample(@Param("record") PmsBaseAttrInfo record, @Param("example") PmsBaseAttrInfoExample example);

    int updateByPrimaryKeySelective(PmsBaseAttrInfo record);

    int updateByPrimaryKey(PmsBaseAttrInfo record);
}