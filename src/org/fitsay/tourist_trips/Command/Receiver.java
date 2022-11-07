package org.fitsay.tourist_trips.Command;
import java.util.ArrayList;
import java.util.List;
import org.fitsay.tourist_trips.Vouchers.Offers;

public class Receiver {
    private final List<Command> commandList = new ArrayList<>();
    private final Offers offers;
    public Receiver(Offers offers){
        this.offers = offers;
        addCommands();
    }
    public void run(int index){
        commandList.get(index).execute();
    }

    public void addCommands() {
        commandList.add(new AddVoucherCommand(offers));
        commandList.add(new ShowOffersCommand(offers));
        commandList.add(new SortByCostCommand(offers));
        commandList.add(new SortByCountryCommand(offers));
        commandList.add(new SortByNameCommand(offers));
    }
}
