package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.dto.SubscribeRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Subscribe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubscribeMapper {

  void upsertSubscribe(Subscribe Subscribe);

}
