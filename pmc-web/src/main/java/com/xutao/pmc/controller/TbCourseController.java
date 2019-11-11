package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbCourse;
import com.pmc.service.TbCourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbCourseController {


    @Reference
    TbCourseService tbCourseService;

    /**
     *分页查询历程
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("courseAll")
    public PageInfo<TbCourse> selectAll(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false)Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "1",required = false)Integer pageSize){
        return tbCourseService.selectAll(pageNum,pageSize);
    }
}
