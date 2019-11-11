package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pmc.bean.TbCulture;
import com.pmc.service.TbCultureService;
import com.xutao.pmc.mapper.TbCultureMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TbCultureServiceImpl implements TbCultureService {

    @Autowired
    TbCultureMapper tbCultureMapper;

    @Override
    public TbCulture getculture() {
        List<TbCulture> list = tbCultureMapper.selectAll();
        return list.get(0);
    }
}
