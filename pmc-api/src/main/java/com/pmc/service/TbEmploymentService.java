package com.pmc.service;

import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbEmployment;

public interface TbEmploymentService {
    PageInfo<TbEmployment> selectAll(Integer pageNum, Integer pageSize);
}
