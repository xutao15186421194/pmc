package com.xutao.pmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PmcWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmcWebApplication.class, args);
    }

}
