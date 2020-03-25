package com.yuan.mapper;

import com.yuan.model.PmsProductInfo;
import com.yuan.model.PmsProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductInfoMapper {
    long countByExample(PmsProductInfoExample example);

    int deleteByExample(PmsProductInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductInfo record);

    int insertSelective(PmsProductInfo record);

    List<PmsProductInfo> selectByExample(PmsProductInfoExample example);

    PmsProductInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProductInfo record, @Param("example") PmsProductInfoExample example);

    int updateByExample(@Param("record") PmsProductInfo record, @Param("example") PmsProductInfoExample example);

    int updateByPrimaryKeySelective(PmsProductInfo record);

    int updateByPrimaryKey(PmsProductInfo record);
}