package com.tencent.wxcloudrun.model;

import com.tencent.wxcloudrun.dto.SubscribeItemRequest;
import lombok.Data;

import java.util.List;

@Data
public class Subscribe {

  private String toUserName;
  private String fromUserName;
  private String createTime;
  private String msgType;
  private String event;
  private String list;


}
