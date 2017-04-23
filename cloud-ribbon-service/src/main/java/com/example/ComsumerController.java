package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tongwen on 2017/4/23.
 */
@RestController
@RequestMapping(value = "/comsumer")
public class ComsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        String serviceUrl = String.format("http://COMPUTE-SERVICE/add?a=%d&b=%d",a,b);
        return restTemplate.getForEntity(serviceUrl, String.class).getBody();
    }
}
