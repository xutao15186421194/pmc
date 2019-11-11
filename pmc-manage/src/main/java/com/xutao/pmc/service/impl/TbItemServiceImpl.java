package com.xutao.pmc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbItem;
import com.pmc.bean.TbItemChild;
import com.pmc.service.TbItemService;
import com.xutao.pmc.mapper.TbItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    TbItemMapper tbItemMapper;
    @Transactional
    @Override
    public List<TbItemChild> listAll() {

        List<TbItemChild> list = new ArrayList<>();
        List<TbItem> tbItems = tbItemMapper.selectAll();
        for (TbItem tbItem : tbItems) {
            TbItemChild child = new TbItemChild();
            child.setId(tbItem.getId().toString());
            child.setTitle(tbItem.getTitle());
            String[] imgs = tbItem.getImageurl().split(",");
            child.setImg(imgs[0]);
            list.add(child);
        }
        return list;
    }
    @Transactional
    @Override
    public PageInfo<TbItem> listPage(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TbItem> list = tbItemMapper.selectAll();
        PageInfo<TbItem> page = new PageInfo<>(list,5);
        return page;
    }

    @Transactional
    @Override
    public PageInfo<TbItem> getItemById(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TbItem> list = tbItemMapper.selectAll();
        int id = list.get(0).getId();
        tbItemMapper.updateGlance(id);
        PageInfo<TbItem> page = new PageInfo<>(list);
        return page;
    }
    @Transactional
    @Override
    public PageInfo<TbItem> getPagebeforeById(Integer id, int i) {
        PageHelper.startPage(id,i);
        List<TbItem> list = tbItemMapper.selectAll();
        PageInfo<TbItem> page = new PageInfo<>(list);
        return page;
    }
    @Transactional
    @Override
    public PageInfo<TbItem> getextpageById(Integer id, int i) {
        PageHelper.startPage(id,i);
        List<TbItem> list = tbItemMapper.selectAll();
        PageInfo<TbItem> page = new PageInfo<>(list);
        return page;
    }
    @Transactional
    @Override
    public void updateGlance(Integer id) {
        tbItemMapper.updateGlance(id);
    }
}
