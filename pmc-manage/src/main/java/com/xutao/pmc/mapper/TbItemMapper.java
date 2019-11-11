package com.xutao.pmc.mapper;

import com.pmc.bean.TbItem;
import tk.mybatis.mapper.common.Mapper;

public interface TbItemMapper extends Mapper<TbItem> {


    /**
     * 修改次数
     * @param id
     */
    void updateGlance(Integer id);
}