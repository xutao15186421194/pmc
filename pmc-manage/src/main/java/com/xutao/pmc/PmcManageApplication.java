package com.xutao.pmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xutao.pmc.mapper")
public class PmcManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmcManageApplication.class, args);
    }

}
