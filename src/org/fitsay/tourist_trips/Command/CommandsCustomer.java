package org.fitsay.tourist_trips.Command;
import java.util.ArrayList;
import java.util.List;

import org.fitsay.tourist_trips.Orders.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;

public class CommandsCustomer {
    private final List<Command> commandList = new ArrayList<>();
    private final Offers offers;
    private final Orders orders;
    public CommandsCustomer(Offers offers, Orders orders){
        this.offers = offers;
        this.orders = orders;
        addCommands();
    }
    public void run(int index){
        commandList.get(index).execute();
    }

    public void addCommands() {
        commandList.add(new AddOrderCommand(orders));
        commandList.add(new ShowOffersCommand(offers));
        commandList.add(new SortByCountryCommand(offers));
        commandList.add(new SortByNameCommand(offers));
        commandList.add(new SortByCostCommand(offers));
    }
}
