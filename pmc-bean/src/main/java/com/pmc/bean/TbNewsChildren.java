package com.pmc.bean;

import java.io.Serializable;

public class TbNewsChildren implements Serializable {

    private Integer maxId;
    private Integer minId;

    public Integer getMaxId() {
        return maxId;
    }

    public void setMaxId(Integer maxId) {
        this.maxId = maxId;
    }

    public Integer getMinId() {
        return minId;
    }

    public void setMinId(Integer minId) {
        this.minId = minId;
    }
}
