package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbNews;
import com.pmc.service.TbNewsService;
import com.xutao.pmc.mapper.TbNewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

@Service
public class TbNewsServiceImpl implements TbNewsService {

    @Autowired
    TbNewsMapper tbNewsMapper;

    @Transactional
    @Override
    public List<TbNews> selectAll() {
        Example example = new Example(TbNews.class);
        example.createCriteria().andEqualTo("statu",1);
        return tbNewsMapper.selectByExample(example);
    }
    @Transactional
    @Override
    public PageInfo<TbNews> listPageAll(Integer pageNum, Integer pageSize,Integer type) {
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(TbNews.class);
        if(type!=null){
            example.createCriteria().andEqualTo("type",type).andEqualTo("statu",1);
        }
        example.setOrderByClause("createdate DESC");
        List<TbNews> list = tbNewsMapper.selectByExample(example);
        PageInfo<TbNews> page = new PageInfo<>(list,5);
        return page;
    }

    @Transactional
    @Override
    public List<TbNews> listCompanynewsAll(Integer id,Integer typeId) {
        tbNewsMapper.updateNewsGlance(id);
        return tbNewsMapper.listCompanynewsAll(id,typeId);
    }
}
