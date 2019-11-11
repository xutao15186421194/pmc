package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pmc.bean.TbContact;
import com.pmc.service.TbContactService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContactController {

    @Reference
    TbContactService tbContactService;

    @RequestMapping("contactAll")
    public List<TbContact> contactAll(){
        return tbContactService.selectAll();
    }

}
