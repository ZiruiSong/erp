package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.Date;

public class FxInventory {
    private Long invenId;

    private Long supplierId;

    private BigDecimal invenAgio;

    private String invenModel;

    private Integer invenNum;

    private BigDecimal tagPrice;

    private String invenSize;

    private String oriSize;

    private String oriModel;

    private String standardSize;

    private String barcode;

    private Date updateTime;

    public Long getInvenId() {
        return invenId;
    }

    public void setInvenId(Long invenId) {
        this.invenId = invenId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getInvenAgio() {
        return invenAgio;
    }

    public void setInvenAgio(BigDecimal invenAgio) {
        this.invenAgio = invenAgio;
    }

    public String getInvenModel() {
        return invenModel;
    }

    public void setInvenModel(String invenModel) {
        this.invenModel = invenModel == null ? null : invenModel.trim();
    }

    public Integer getInvenNum() {
        return invenNum;
    }

    public void setInvenNum(Integer invenNum) {
        this.invenNum = invenNum;
    }

    public BigDecimal getTagPrice() {
        return tagPrice;
    }

    public void setTagPrice(BigDecimal tagPrice) {
        this.tagPrice = tagPrice;
    }

    public String getInvenSize() {
        return invenSize;
    }

    public void setInvenSize(String invenSize) {
        this.invenSize = invenSize == null ? null : invenSize.trim();
    }

    public String getOriSize() {
        return oriSize;
    }

    public void setOriSize(String oriSize) {
        this.oriSize = oriSize == null ? null : oriSize.trim();
    }

    public String getOriModel() {
        return oriModel;
    }

    public void setOriModel(String oriModel) {
        this.oriModel = oriModel == null ? null : oriModel.trim();
    }

    public String getStandardSize() {
        return standardSize;
    }

    public void setStandardSize(String standardSize) {
        this.standardSize = standardSize == null ? null : standardSize.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}