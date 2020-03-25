package com.yuan.mapper;

import com.yuan.model.PmsProductImage;
import com.yuan.model.PmsProductImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductImageMapper {
    long countByExample(PmsProductImageExample example);

    int deleteByExample(PmsProductImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductImage record);

    int insertSelective(PmsProductImage record);

    List<PmsProductImage> selectByExample(PmsProductImageExample example);

    PmsProductImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProductImage record, @Param("example") PmsProductImageExample example);

    int updateByExample(@Param("record") PmsProductImage record, @Param("example") PmsProductImageExample example);

    int updateByPrimaryKeySelective(PmsProductImage record);

    int updateByPrimaryKey(PmsProductImage record);
}