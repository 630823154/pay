package com.hzit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class, args);
    }

    /**
     * 单例创建restTemplate不会造成资源浪费
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){



        return  new RestTemplate();
    }

}
