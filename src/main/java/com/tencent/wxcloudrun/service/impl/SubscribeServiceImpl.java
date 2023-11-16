package com.tencent.wxcloudrun.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.tencent.wxcloudrun.dao.CountersMapper;
import com.tencent.wxcloudrun.dao.SubscribeMapper;
import com.tencent.wxcloudrun.dto.SubscribeRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Subscribe;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.SubscribeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubscribeServiceImpl implements SubscribeService {

  final SubscribeMapper subscribeMapper;

  public SubscribeServiceImpl(@Autowired SubscribeMapper subscribeMapper) {
    this.subscribeMapper = subscribeMapper;
  }


  @Override
  public void upsertSubscribe(SubscribeRequest subscribeRequest) {

    Subscribe subscribe = new Subscribe();
    subscribe.setFromUserName(subscribeRequest.getFromUserName());
    subscribe.setEvent(subscribeRequest.getEvent());
    subscribe.setToUserName(subscribeRequest.getToUserName());
    subscribe.setMsgType(subscribeRequest.getMsgType());
    subscribe.setCreateTime(subscribeRequest.getCreateTime());
    subscribe.setList(JSONUtil.toJsonStr(subscribeRequest.getList()));
    subscribeMapper.upsertSubscribe(subscribe);
  }

}
