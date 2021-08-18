package com.swcguild.flooringmastery.dao;

import com.swcguild.flooringmastery.dto.Order;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public interface OrderDaoFM {
    
    ArrayList<Order> getOrderList();
    
    public LocalDate getLocalDate();
    
    void addOrder(Order currentOrder);
    
    void removeOrder(Order currentOrder);
    
    void writeOrders();
    
    List<File> collectFiles() throws IOException;
    
    void purgeFiles(List<File> fileList);
    
    void loadAllFiles(List<File> fileList);
    
    void loadFile(File orderFile);
    
}
