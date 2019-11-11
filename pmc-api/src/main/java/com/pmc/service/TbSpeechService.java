package com.pmc.service;

import com.github.pagehelper.PageInfo;
import com.pmc.bean.TbSpeech;

public interface TbSpeechService {

    TbSpeech getSpeech();

    PageInfo<TbSpeech> listSpeechAll(Integer pageNum, Integer pageSize);
}
