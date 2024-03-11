package com.example.bootcloudalibabaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.service"})
public class BootcloudAlibabaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcloudAlibabaProviderApplication.class, args);
    }

}
