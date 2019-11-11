package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pmc.bean.TbContact;
import com.pmc.service.TbContactService;
import com.xutao.pmc.mapper.TbContactMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TbContactServiceImpl implements TbContactService {

    @Autowired
    TbContactMapper tbContactMapper;

    @Override
    public List<TbContact> selectAll() {

        return tbContactMapper.selectAll();
    }
}
