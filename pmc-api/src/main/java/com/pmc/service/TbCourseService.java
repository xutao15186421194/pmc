package com.pmc.service;

import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbCourse;

import java.util.List;

public interface TbCourseService {

    List<TbCourse> listCourse();

    PageInfo<TbCourse> selectAll(Integer pageNum, Integer pageSize);
}
