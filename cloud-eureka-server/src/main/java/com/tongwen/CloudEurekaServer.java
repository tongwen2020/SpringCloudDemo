package com.tongwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by tongwen on 2017/3/30.
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer.class, args);
    }
}
