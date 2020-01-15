package com.der.regularexpression;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RegularExpressionApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegularExpressionApplication.class, args);
    }

}
