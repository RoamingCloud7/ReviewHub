package com.roamingcloud.reviewhub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.roamingcloud.reviewhub.mapper")
@SpringBootApplication
public class ReviewHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewHubApplication.class, args);
    }

}
