package com.yuan.mapper;

import com.yuan.model.WmsWareOrderTask;
import com.yuan.model.WmsWareOrderTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsWareOrderTaskMapper {
    long countByExample(WmsWareOrderTaskExample example);

    int deleteByExample(WmsWareOrderTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WmsWareOrderTask record);

    int insertSelective(WmsWareOrderTask record);

    List<WmsWareOrderTask> selectByExample(WmsWareOrderTaskExample example);

    WmsWareOrderTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WmsWareOrderTask record, @Param("example") WmsWareOrderTaskExample example);

    int updateByExample(@Param("record") WmsWareOrderTask record, @Param("example") WmsWareOrderTaskExample example);

    int updateByPrimaryKeySelective(WmsWareOrderTask record);

    int updateByPrimaryKey(WmsWareOrderTask record);
}