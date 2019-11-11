package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbCourse;
import com.pmc.service.TbCourseService;
import com.xutao.pmc.mapper.TbCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TbCourseServiceImpl implements TbCourseService
{

    @Autowired
    TbCourseMapper tbCourseMapper;

    @Override
    public List<TbCourse> listCourse() {
        Example example = new Example(TbCourse.class);
        example.setOrderByClause("years DESC");
        return tbCourseMapper.selectByExample(example);
    }

    @Override
    public PageInfo<TbCourse> selectAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(TbCourse.class);
        example.setOrderByClause("years DESC");
        List<TbCourse> list = tbCourseMapper.selectByExample(example);
        PageInfo<TbCourse> page = new PageInfo<>(list,3);
        return page;
    }
}
