package com.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/4/17.
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/query")
    public String hiService(String name) {
        return restTemplate.getForObject("http://PROVIDER-HI/hi?name=" + name, String.class);
    }
}
