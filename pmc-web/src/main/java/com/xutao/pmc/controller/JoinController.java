package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbEmployment;
import com.pmc.service.TbEmploymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {

    @Reference
    TbEmploymentService tbEmploymentService;

    @RequestMapping("joinselectAll")
    public PageInfo<TbEmployment> selectAll(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false)Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "2",required = false)Integer pageSize
    ){
        return tbEmploymentService.selectAll(pageNum,pageSize);
    }
}
