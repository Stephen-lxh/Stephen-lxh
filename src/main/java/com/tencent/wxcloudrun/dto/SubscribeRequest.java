package com.tencent.wxcloudrun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class SubscribeRequest {

  @JsonProperty("ToUserName")
  private String ToUserName;
  @JsonProperty("FromUserName")
  private String FromUserName;
  @JsonProperty("CreateTime")
  private String CreateTime;
  @JsonProperty("MsgType")
  private String MsgType;
  @JsonProperty("Event")
  private String Event;
  @JsonProperty("List")
  private List<SubscribeItemRequest> List;


}
