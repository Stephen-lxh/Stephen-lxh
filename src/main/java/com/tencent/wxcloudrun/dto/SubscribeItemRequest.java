package com.tencent.wxcloudrun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SubscribeItemRequest {

  @JsonProperty("TemplateId")
  private String TemplateId;
  @JsonProperty("SubscribeStatusString")
  private String SubscribeStatusString;
  @JsonProperty("PopupScene")
  private String PopupScene;



}
