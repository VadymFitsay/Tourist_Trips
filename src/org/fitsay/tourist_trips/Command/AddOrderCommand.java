package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Orders.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;

public class AddOrderCommand implements Command {
    Orders orders;
    public AddOrderCommand(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void execute() {
        orders.addOrder();
    }
}
