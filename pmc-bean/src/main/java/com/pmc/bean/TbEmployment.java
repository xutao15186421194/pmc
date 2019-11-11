package com.pmc.bean;

import java.io.Serializable;
import java.util.*;

public class TbEmployment implements Serializable {
    private Integer id;

    private String name;

    private Integer education;

    private String years;

    private Integer statu;

    private Date createdate;

    private Date upload;

    TbJob jobMap;

    TbClaim claimMap;

    public TbJob getJobMap() {
        return jobMap;
    }

    public void setJobMap(TbJob jobMap) {
        this.jobMap = jobMap;
    }

    public TbClaim getClaimMap() {
        return claimMap;
    }

    public void setClaimMap(TbClaim claimMap) {
        this.claimMap = claimMap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years == null ? null : years.trim();
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpload() {
        return upload;
    }

    public void setUpload(Date upload) {
        this.upload = upload;
    }
}