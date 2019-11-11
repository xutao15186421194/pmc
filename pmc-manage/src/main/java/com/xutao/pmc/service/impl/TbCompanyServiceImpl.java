package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pmc.bean.TbCompany;
import com.pmc.service.TbCompanyService;
import com.xutao.pmc.mapper.TbCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TbCompanyServiceImpl implements TbCompanyService {

    @Autowired
    TbCompanyMapper tbCompanyMapper;

    @Override
    public TbCompany getCompany() {
        List<TbCompany> list = tbCompanyMapper.selectAll();
        return list.get(0);
    }
}
