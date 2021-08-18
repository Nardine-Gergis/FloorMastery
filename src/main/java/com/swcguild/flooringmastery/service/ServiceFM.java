package com.swcguild.flooringmastery.service;

import com.swcguild.flooringmastery.dto.Order;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public interface ServiceFM {
    

    Order createOrderTemplate(int orderNumber, LocalDate currentDate, String customerName, String customerState, 
            String productName, BigDecimal Area, BigDecimal productMaterialCost, BigDecimal productLaborCost, BigDecimal stateTaxRate);
    

    Order modifyExistingOrder(Order existingOrder, String newName, String newState, 
            String newProductName, BigDecimal newArea, BigDecimal productMaterialsCost, BigDecimal productLaborCost, BigDecimal stateTaxRate);
    

    Order runOrderCalculations(Order orderTemplate);
    

    ArrayList<Order> removeOrder(boolean customerPermission, Order requestedOrder);

    void storeOrder(Order completedOrder, boolean customerPermission);
    
    ArrayList<Order> getOrderList();
    

    ArrayList<Order> getOrderListByDate(LocalDate userDate, ArrayList<Order> orderList);
    

    Order getOrder(LocalDate userDate, int userOrderNumber);
    

    BigDecimal getMaterialsCost(String productName);
    

    BigDecimal getLaborCost(String productName);
    

    BigDecimal getTax(String customerState);
    

    int getOrderNumber();
    

    LocalDate getLocalDate();
    

    void loadOrders()throws IOException;
    

    void loadProducts();
    

    void loadTaxes();
    

    void writeOrders(int trainingMode) throws IOException;
    
}
