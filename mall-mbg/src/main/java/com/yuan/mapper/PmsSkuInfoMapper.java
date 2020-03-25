package com.yuan.mapper;

import com.yuan.model.PmsSkuInfo;
import com.yuan.model.PmsSkuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuInfoMapper {
    long countByExample(PmsSkuInfoExample example);

    int deleteByExample(PmsSkuInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsSkuInfo record);

    int insertSelective(PmsSkuInfo record);

    List<PmsSkuInfo> selectByExample(PmsSkuInfoExample example);

    PmsSkuInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsSkuInfo record, @Param("example") PmsSkuInfoExample example);

    int updateByExample(@Param("record") PmsSkuInfo record, @Param("example") PmsSkuInfoExample example);

    int updateByPrimaryKeySelective(PmsSkuInfo record);

    int updateByPrimaryKey(PmsSkuInfo record);
}