package com.jsh.erp.datasource.entities;

public class FxArea {
    private Integer areaId;

    private String areaName;

    private Integer areaParentId;

    private String areaZip;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(Integer areaParentId) {
        this.areaParentId = areaParentId;
    }

    public String getAreaZip() {
        return areaZip;
    }

    public void setAreaZip(String areaZip) {
        this.areaZip = areaZip == null ? null : areaZip.trim();
    }
}