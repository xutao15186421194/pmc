package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pmc.bean.TbNewsChildren;
import com.pmc.service.TbNewsChildrenService;
import com.xutao.pmc.mapper.TbNewsChildrenMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TbNewsChildrenServiceImpl implements TbNewsChildrenService {

    @Autowired
    TbNewsChildrenMapper tbNewsChildrenMapper;

    @Override
    public TbNewsChildren getmaxMinById(Integer typeId) {
        return tbNewsChildrenMapper.getmaxMinById(typeId);
    }
}
