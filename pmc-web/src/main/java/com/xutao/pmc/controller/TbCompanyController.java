package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pmc.bean.TbCompany;
import com.pmc.service.TbCompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbCompanyController {


    @Reference
    TbCompanyService tbCompanyService;

    /**
     * 公司简介
     * @return
     */
    @RequestMapping("companyAll")
    public TbCompany companyAll(){
        return tbCompanyService.getCompany();
    }
}
