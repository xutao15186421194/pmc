package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pmc.bean.TbItemChild;
import com.pmc.service.TbItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Reference
    TbItemService tbItemService;

    /**
     * 访问主页面
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 去到项目展示页面
     * @return
     */
    @RequestMapping("/products")
    public String products(){
        return "products";
    }

    /**
     * 跳转到单个项目详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/productslist")
    public String productslist(Integer id, Model model){
        List<TbItemChild> item = tbItemService.listAll();
        tbItemService.updateGlance(id);
        int i = 0;
        int pageNum = 0;
        for(TbItemChild ids: item){
            i++;
            if(id==Integer.parseInt(ids.getId())){
                pageNum = i++;
                break;
            }
        }
        model.addAttribute("pageNumId",pageNum);
        return "productslist";
    }

    /**
     * 人才招聘
     * @return
     */
    @RequestMapping("join.html")
    public String join(){
        return "join";
    }

    /**
     * 联系我们
     * @return
     */
    @RequestMapping("contact.html")
    public String contact(){
        return "contact";
    }

    /**
     * 公司简介
     */
    @RequestMapping("about.html")
    public String about(){
        return "about";
    }

    /**
     * 公司文化
     */
    @RequestMapping("culture.html")
    public String culture(){
        return "culture";
    }

    /**
     * 领导致辞
     */
    @RequestMapping("speech.html")
    public String speech(){
        return "speech";
    }

    /**
     * 发展历程
     */
    @RequestMapping("course.html")
    public String course(){
        return "course";
    }

    /**
     * 公司新闻
     * @return
     */
    @RequestMapping("companynews.html")
    public String companynews(){
        return "companynews";
    }
    /**
     * 行业新闻
     * @return
     */
    @RequestMapping("industrynews.html")
    public String industrynews(){
        return "industrynews";
    }
    /**
     * 公司大事记
     * @return
     */
    @RequestMapping("chroniclenews.html")
    public String chroniclenews(){
        return "chroniclenews";
    }

    /**
     * 行业新闻详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("industrynewslist.html")
    public String industrynewslist(Integer id,Model model){
        int ids = id !=null ? id :6;
        model.addAttribute("industrynewsId",ids);
        return "industrynewslist";
    }

    /**
     * 公司新闻详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("companynewslist.html")
    public String companynewslist(Integer id,Model model){
        int ids = id !=null ? id :7;
        model.addAttribute("companynewsId",ids);
        return "companynewslist";
    }

    /**
     * 公司大事迹详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("chroniclenewslist.html")
    public String chroniclenewslist(Integer id,Model model){
        int ids = id !=null ? id :5;
        model.addAttribute("chroniclenewsId",ids);
        return "chroniclenewslist";
    }
}
