package com.xutao.pmc.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper createPageHelper(){
        PageHelper pageHelper=new PageHelper();
        return pageHelper;
    }

}
