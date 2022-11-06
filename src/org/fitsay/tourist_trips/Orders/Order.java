package org.fitsay.tourist_trips.Orders;
import java.util.ArrayList;
import java.util.List;




public class Order {
    private String NameCustomer;
    private String PhoneNumber;
    private final int OrderID;
    public static int NumOrders;
    protected final List<Order> orders = new ArrayList<>();

    public Order(){
        OrderID = NumOrders;
        NumOrders++;
    }
}
