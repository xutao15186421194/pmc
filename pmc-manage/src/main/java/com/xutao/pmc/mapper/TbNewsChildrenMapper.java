package com.xutao.pmc.mapper;

import com.pmc.bean.TbNewsChildren;
import tk.mybatis.mapper.common.Mapper;

public interface  TbNewsChildrenMapper extends Mapper<TbNewsChildren> {


    TbNewsChildren getmaxMinById(Integer typeId);
}
