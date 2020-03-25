package com.yuan.mapper;

import com.yuan.model.WmsWareInfo;
import com.yuan.model.WmsWareInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsWareInfoMapper {
    long countByExample(WmsWareInfoExample example);

    int deleteByExample(WmsWareInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WmsWareInfo record);

    int insertSelective(WmsWareInfo record);

    List<WmsWareInfo> selectByExample(WmsWareInfoExample example);

    WmsWareInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WmsWareInfo record, @Param("example") WmsWareInfoExample example);

    int updateByExample(@Param("record") WmsWareInfo record, @Param("example") WmsWareInfoExample example);

    int updateByPrimaryKeySelective(WmsWareInfo record);

    int updateByPrimaryKey(WmsWareInfo record);
}