package org.fitsay.tourist_trips.Orders;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public static int countOfOrders;
    private String number;
    private final int idOfOrder;
    protected final List<Order> orders = new ArrayList<>();

    public Order(){
        idOfOrder = countOfOrders;
        countOfOrders++;
    }
}
