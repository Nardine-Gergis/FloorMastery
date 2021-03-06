package com.swcguild.flooringmastery.dto;

import java.math.BigDecimal;

public class Tax {
    String stateName;
    BigDecimal taxRate;
    
    public Tax(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
}
