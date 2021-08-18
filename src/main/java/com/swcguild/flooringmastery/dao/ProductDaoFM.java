package com.swcguild.flooringmastery.dao;

import com.swcguild.flooringmastery.dto.Product;
import java.util.ArrayList;

public interface ProductDaoFM {
    
    ArrayList<Product> getProductList();
    
    int getOrderNumber();
    
    int updateCounter();
    
    void loadProducts();
    
    void loadCounter();
    
    void writeCounter();
    
}
