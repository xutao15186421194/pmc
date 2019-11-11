package com.pmc.service;

import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbNews;

import java.util.List;

public interface TbNewsService {

    List<TbNews> selectAll();

    PageInfo<TbNews> listPageAll(Integer pageNum, Integer pageSize,Integer type);

    List<TbNews> listCompanynewsAll(Integer id,Integer typeId);

}
