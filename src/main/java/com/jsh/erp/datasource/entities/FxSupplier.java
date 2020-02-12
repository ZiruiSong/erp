package com.jsh.erp.datasource.entities;

import java.util.Date;

public class FxSupplier {
    private Long id;

    private String supplierDesc;

    private String supplierName;

    private Integer supplierType;

    private Integer supplierStatus;

    private Date createTime;

    private String distributionDesc;

    private String returnAddr;

    private Long userId;

    private String supportExpress;

    private String deliveryLimitation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierDesc() {
        return supplierDesc;
    }

    public void setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc == null ? null : supplierDesc.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Integer getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(Integer supplierType) {
        this.supplierType = supplierType;
    }

    public Integer getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(Integer supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDistributionDesc() {
        return distributionDesc;
    }

    public void setDistributionDesc(String distributionDesc) {
        this.distributionDesc = distributionDesc == null ? null : distributionDesc.trim();
    }

    public String getReturnAddr() {
        return returnAddr;
    }

    public void setReturnAddr(String returnAddr) {
        this.returnAddr = returnAddr == null ? null : returnAddr.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSupportExpress() {
        return supportExpress;
    }

    public void setSupportExpress(String supportExpress) {
        this.supportExpress = supportExpress == null ? null : supportExpress.trim();
    }

    public String getDeliveryLimitation() {
        return deliveryLimitation;
    }

    public void setDeliveryLimitation(String deliveryLimitation) {
        this.deliveryLimitation = deliveryLimitation == null ? null : deliveryLimitation.trim();
    }
}