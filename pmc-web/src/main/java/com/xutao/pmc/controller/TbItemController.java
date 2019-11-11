package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.*;
import com.pmc.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class TbItemController {

    @Reference
    TbItemService tbItemService;

    @Reference
    TbCompanyService tbCompanyService;

    @Reference
    TbCultureService tbCultureService;

    @Reference
    TbCourseService tbCourseService;

    @Reference
    TbSpeechService tbSpeechService;

    /**
     * 首页项目轮播展示
     * @return
     */
    @RequestMapping("/ItemlistAll")
    @ResponseBody
    public List<TbItemChild> listAll(){
        return tbItemService.listAll();
    }

    /**
     * 分页查询项目案例
     * @return
     */
    @RequestMapping("/pageListItem")
    @ResponseBody
    public PageInfo<TbItem> pageListItem(
            @RequestParam(value = "pageNum", required = false,defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize", required = false,defaultValue = "9")Integer pageSize){

        PageInfo<TbItem> page = tbItemService.listPage(pageNum,pageSize);
        return page;
    }


    /**
     * 项目详情分页单条数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("getItemById")
    @ResponseBody
    public PageInfo<TbItem> getItemById(
            @RequestParam(value = "pageNum", required = false,defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize", required = false,defaultValue = "1")Integer pageSize){
        PageInfo<TbItem> page = tbItemService.getItemById(pageNum,pageSize);
        return page;
    }

    /**
     *前一页的数据
     * @param id
     * @return
     */
    @RequestMapping("getPagebeforeById")
    @ResponseBody
    public TbItem getPagebeforeById(@RequestParam(value = "id", required = false,defaultValue = "1")Integer id){
        PageInfo<TbItem> page = tbItemService.getPagebeforeById(id,1);
        List<TbItem> list = page.getList();
        return list.get(0);
    }

    /**
     * 后一页的数据
     * @param id
     * @return
     */
    @RequestMapping("getextpageById")
    @ResponseBody
    public TbItem getextpageById(@RequestParam(value = "id", required = false,defaultValue = "1")Integer id){
        PageInfo<TbItem> page = tbItemService.getextpageById(id,1);
        List<TbItem> list = page.getList();
        return list.get(0);
    }

    /**
     * 公司简介
     * @return
     */
    @RequestMapping("getCompany")
    @ResponseBody
    public TbCompany getCompany(){
        return tbCompanyService.getCompany();
    }

    /**
     * 公司文化
     * @return
     */
    @RequestMapping("getculture")
    @ResponseBody
    public TbCulture getculture(){
        return tbCultureService.getculture();
    }

    /**
     * 发展历程
     * @return
     */
    @RequestMapping("getcourse")
    @ResponseBody
    public List<TbCourse> course(){
        return tbCourseService.listCourse();
    }

    /**
     * 领导致辞
     * @return
     */
    @RequestMapping("getspeech")
    @ResponseBody
    public TbSpeech getspeech(){
        return tbSpeechService.getSpeech();
    }
}
