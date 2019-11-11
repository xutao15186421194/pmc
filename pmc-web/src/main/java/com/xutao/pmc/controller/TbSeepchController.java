package com.xutao.pmc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbSpeech;
import com.pmc.service.TbSpeechService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbSeepchController {

    @Reference
    TbSpeechService tbSpeechService;

    @RequestMapping("speechAll")
    public PageInfo<TbSpeech> listAll(
            @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "1")Integer pageSize){
        return tbSpeechService.listSpeechAll(pageNum,pageSize);
    }

}
