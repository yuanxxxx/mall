package com.yuan.mapper;

import com.yuan.model.PaymentInfo;
import com.yuan.model.PaymentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentInfoMapper {
    long countByExample(PaymentInfoExample example);

    int deleteByExample(PaymentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentInfo record);

    int insertSelective(PaymentInfo record);

    List<PaymentInfo> selectByExample(PaymentInfoExample example);

    PaymentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentInfo record, @Param("example") PaymentInfoExample example);

    int updateByExample(@Param("record") PaymentInfo record, @Param("example") PaymentInfoExample example);

    int updateByPrimaryKeySelective(PaymentInfo record);

    int updateByPrimaryKey(PaymentInfo record);
}