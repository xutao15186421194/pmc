package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbSpeech;
import com.pmc.service.TbSpeechService;
import com.xutao.pmc.mapper.TbSpeechMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TbSpeechServiceImpl implements TbSpeechService {

    @Autowired
    TbSpeechMapper tbSpeechMapper;

    @Override
    public TbSpeech getSpeech() {
        Example example = new Example(TbSpeech.class);
        example.setOrderByClause("createdate DESC");
        List<TbSpeech> tbSpeeches = tbSpeechMapper.selectByExample(example);
        return tbSpeeches.get(0);
    }

    @Override
    public PageInfo<TbSpeech> listSpeechAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(TbSpeech.class);
        example.setOrderByClause("createdate DESC");
        List<TbSpeech> list = tbSpeechMapper.selectAll();
        PageInfo<TbSpeech> page = new PageInfo<>(list,3);
        return page;
    }
}
