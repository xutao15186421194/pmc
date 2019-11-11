package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbNews;
import com.pmc.bean.TbNewsChildren;
import com.pmc.service.TbNewsChildrenService;
import com.pmc.service.TbNewsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbNewsController {

    @Reference
    TbNewsService tbNewsService;

    @Reference
    TbNewsChildrenService tbNewsChildrenService;

    /**
     * 主页新闻查询
     * @return
     */
    @RequestMapping("selectAll")
    public List<TbNews> selectAll(){
        return tbNewsService.selectAll();
    }

    /**
     * 分页查询
     * @return
     */
    @RequestMapping("newsAll")
    public PageInfo<TbNews> newsAll(
            @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "4")Integer pageSize,
            @RequestParam(value = "type",required = false,defaultValue ="")Integer type){
        return tbNewsService.listPageAll(pageNum,pageSize,type);
    }

    /**
     * 查询页面详情，三条数据，
     * @param id
     * @return
     */
    @RequestMapping("getCompanynewsListAll")
    public List<TbNews> getCompanynewsListAll(Integer id,Integer typeId){
        return tbNewsService.listCompanynewsAll(id,typeId);
    }

    /**
     * 拿到最大id以及最小id
     * @param typeId
     * @return
     */
    @RequestMapping("getmaxMinById")
    public TbNewsChildren getmaxMinById(Integer typeId){

        return tbNewsChildrenService.getmaxMinById(typeId);
    }
}
