package com.pmc.bean;

import java.io.Serializable;
import java.util.Date;

public class TbNews implements Serializable {
    private Integer id;

    private Integer type;

    private String title;

    private Date createdate;

    private String glance;

    private Integer statu;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getGlance() {
        return glance;
    }

    public void setGlance(String glance) {
        this.glance = glance == null ? null : glance.trim();
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}