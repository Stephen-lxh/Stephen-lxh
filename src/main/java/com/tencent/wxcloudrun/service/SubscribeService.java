package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dto.SubscribeRequest;
import com.tencent.wxcloudrun.model.Counter;

import java.util.Optional;

public interface SubscribeService {

  void upsertSubscribe(SubscribeRequest subscribeRequest);

}
