package com.yuan.mapper;

import com.yuan.model.PmsSkuImage;
import com.yuan.model.PmsSkuImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuImageMapper {
    long countByExample(PmsSkuImageExample example);

    int deleteByExample(PmsSkuImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsSkuImage record);

    int insertSelective(PmsSkuImage record);

    List<PmsSkuImage> selectByExample(PmsSkuImageExample example);

    PmsSkuImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsSkuImage record, @Param("example") PmsSkuImageExample example);

    int updateByExample(@Param("record") PmsSkuImage record, @Param("example") PmsSkuImageExample example);

    int updateByPrimaryKeySelective(PmsSkuImage record);

    int updateByPrimaryKey(PmsSkuImage record);
}