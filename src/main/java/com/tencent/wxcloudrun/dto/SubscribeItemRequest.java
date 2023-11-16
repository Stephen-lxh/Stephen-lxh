package com.tencent.wxcloudrun.dto;

import lombok.Data;

@Data
public class SubscribeRequest {


  private String ToUserName;
  private String FromUserName;
  private String CreateTime;
  private String MsgType;
  private String Event;
  private String ToUserName;
  private String ToUserName;

  private

  {
    "ToUserName": "gh_123456789abc",
          "FromUserName": "o7esq5OI1Uej6Xixw1lA2H7XDVbc",
          "CreateTime": "1620973045",
          "MsgType": "event",
          "Event": "subscribe_msg_popup_event",
          "List": [   {
    "TemplateId": "hD-ixGOhYmUfjOnI8MCzQMPshzGVeux_2vzyvQu7O68",
            "SubscribeStatusString": "accept",
            "PopupScene": "0"
  }],
  }
  若 "List" 只有一个对象，则只返回对象本身；若 "List" 多于一个对象，则返回一个包含所有对象的数组。

  参数说明

}
