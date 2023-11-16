package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.dto.SubscribeRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.SubscribeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * counter控制器
 */
@RestController
public class SubscribeController {

    final SubscribeService subscribeService;
    final Logger logger;

    public SubscribeController(@Autowired SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
        this.logger = LoggerFactory.getLogger(SubscribeController.class);
    }


    /**
     * 添加订阅记录
     *
     * @param request {@link SubscribeRequest}
     * @return API response json
     */
    @PostMapping(value = "/api/addSubscribe")
    ApiResponse create(@RequestBody SubscribeRequest request) {
        logger.info("/api/count post request, action: {}", request);
        subscribeService.upsertSubscribe(request);
        return ApiResponse.ok();


    }

}