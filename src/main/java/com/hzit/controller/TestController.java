package com.hzit.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    String url="https://api.mch.weixin.qq.com/v3/pay/transactions/native";
    public void test(){
        Map map=new HashMap();
        map.put("x","d");
      String code_url= restTemplate.postForObject(url, map,String.class);
        System.out.println(code_url);




    }

}
