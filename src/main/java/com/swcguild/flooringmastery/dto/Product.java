package com.swcguild.flooringmastery.dto;

import java.math.BigDecimal;

public class Product {
    String productName;
    BigDecimal costMaterialFtSq;
    BigDecimal costLaborFtSq;
    
    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getCostMaterialFtSq() {
        return costMaterialFtSq;
    }

    public void setCostMaterialFtSq(BigDecimal costMaterialFtSq) {
        this.costMaterialFtSq = costMaterialFtSq;
    }

    public BigDecimal getCostLaborFtSq() {
        return costLaborFtSq;
    }

    public void setCostLaborFtSq(BigDecimal costLaborFtSq) {
        this.costLaborFtSq = costLaborFtSq;
    }
}
