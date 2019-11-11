package com.xutao.pmc.mapper;

import com.pmc.bean.TbNews;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbNewsMapper extends Mapper<TbNews> {

    List<TbNews> listCompanynewsAll(@Param("id")Integer id, @Param("typeId")Integer typeId);

    void updateNewsGlance(Integer id);
}
