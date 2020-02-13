package com.jsh.erp.datasource.vo;

import com.jsh.erp.datasource.entities.FxInventory;

public class FxInventoryVo extends FxInventory {
    String supplierName;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
