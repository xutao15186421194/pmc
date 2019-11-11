package com.pmc.service;

import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbItem;
import com.pmc.bean.TbItemChild;

import java.util.List;

public interface TbItemService {

    List<TbItemChild> listAll();

    PageInfo<TbItem> listPage(Integer pageNum, Integer pageSize);

    PageInfo<TbItem> getItemById(Integer pageNum, Integer pageSize);

    PageInfo<TbItem> getPagebeforeById(Integer id, int i);

    PageInfo<TbItem> getextpageById(Integer id, int i);

    void updateGlance(Integer id);
}
