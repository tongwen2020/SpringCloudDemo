package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tongwen on 2017/4/23.
 */
@RestController
@RequestMapping(value="/consumer")
public class ConsumerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ComputeClient computeClient;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return computeClient.add(a, b);
    }

}
