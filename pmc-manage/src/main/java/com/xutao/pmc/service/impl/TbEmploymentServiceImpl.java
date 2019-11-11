package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbClaim;
import com.pmc.bean.TbCulture;
import com.pmc.bean.TbEmployment;
import com.pmc.bean.TbJob;
import com.pmc.service.TbEmploymentService;
import com.xutao.pmc.mapper.TbClaimMapper;
import com.xutao.pmc.mapper.TbEmploymentMapper;
import com.xutao.pmc.mapper.TbJobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class TbEmploymentServiceImpl implements TbEmploymentService {

    @Autowired
    TbEmploymentMapper tbEmploymentMapper;

    @Autowired
    TbJobMapper tbJobMapper;

    @Autowired
    TbClaimMapper tbClaimMapper;

    @Override
    public PageInfo<TbEmployment> selectAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(TbEmployment.class);
        example.createCriteria().andEqualTo("statu",1);
        List<TbEmployment> list = tbEmploymentMapper.selectByExample(example);
        for(TbEmployment employment : list){
            TbJob tbJob = new TbJob();
            tbJob.setEmpid(employment.getId());
            employment.setJobMap(tbJobMapper.selectOne(tbJob));
            TbClaim claim = new TbClaim();
            claim.setEmpid(employment.getId());
            employment.setClaimMap(tbClaimMapper.selectOne(claim));
        }
        PageInfo<TbEmployment> page = new PageInfo<>(list,5);
        return  page;
    }
}
