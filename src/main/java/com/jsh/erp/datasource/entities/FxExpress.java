package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.Date;

public class FxExpress {
    private Long id;

    private String expressCode;

    private String jdCode;

    private String tbCode;

    private String expressName;

    private Date createTime;

    private BigDecimal firstPrice;

    private BigDecimal continuousPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode == null ? null : expressCode.trim();
    }

    public String getJdCode() {
        return jdCode;
    }

    public void setJdCode(String jdCode) {
        this.jdCode = jdCode == null ? null : jdCode.trim();
    }

    public String getTbCode() {
        return tbCode;
    }

    public void setTbCode(String tbCode) {
        this.tbCode = tbCode == null ? null : tbCode.trim();
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName == null ? null : expressName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(BigDecimal firstPrice) {
        this.firstPrice = firstPrice;
    }

    public BigDecimal getContinuousPrice() {
        return continuousPrice;
    }

    public void setContinuousPrice(BigDecimal continuousPrice) {
        this.continuousPrice = continuousPrice;
    }
}