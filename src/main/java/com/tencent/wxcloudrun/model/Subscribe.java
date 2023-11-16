package com.tencent.wxcloudrun.dto;

import lombok.Data;

import java.util.List;

@Data
public class SubscribeRequest {

  private String ToUserName;
  private String FromUserName;
  private String CreateTime;
  private String MsgType;
  private String Event;
  private List<SubscribeItemRequest> List;


}
