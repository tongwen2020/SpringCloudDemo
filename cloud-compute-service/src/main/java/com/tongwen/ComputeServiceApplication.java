package com.tongwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by tongwen on 2017/3/30.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ComputeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComputeServiceApplication.class, args);
    }
}
