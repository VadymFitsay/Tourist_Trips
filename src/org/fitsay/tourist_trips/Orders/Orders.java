package org.fitsay.tourist_trips.Orders;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    protected  List<Order> orders = new ArrayList<>();
    public void GenerateOrders(){
        System.out.println("GenerateOrders");
    }
    public void addOrder(){
        System.out.println("AddOrder");
    }
    public void deleteOrder(){
        System.out.println("deleteOrder");
    }
    public void SortByNameCustomer(){
        System.out.println("SortByNameCustomer");
    }
}
