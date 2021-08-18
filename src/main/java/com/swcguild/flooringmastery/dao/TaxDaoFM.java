package com.swcguild.flooringmastery.dao;

import com.swcguild.flooringmastery.dto.Tax;
import java.util.ArrayList;

public interface TaxDaoFM {
    
    ArrayList<Tax> getTaxList();
    
    void loadTaxes();
    
}
