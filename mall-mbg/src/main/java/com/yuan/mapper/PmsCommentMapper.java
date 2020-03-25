package com.yuan.mapper;

import com.yuan.model.PmsComment;
import com.yuan.model.PmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentMapper {
    long countByExample(PmsCommentExample example);

    int deleteByExample(PmsCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsComment record);

    int insertSelective(PmsComment record);

    List<PmsComment> selectByExample(PmsCommentExample example);

    PmsComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByExample(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByPrimaryKeySelective(PmsComment record);

    int updateByPrimaryKey(PmsComment record);
}