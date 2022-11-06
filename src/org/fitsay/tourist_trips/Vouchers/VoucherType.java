package org.fitsay.tourist_trips.Vouchers;

public enum VoucherType {
    Excursion(2000.0),Ski(3000.0);
    private double price;
    VoucherType(double price){
        this.price = price;
    }
    public VoucherType getTypeByOrdinal(int ordinal) {
        for(VoucherType t : VoucherType.values()) {
            if(t.ordinal() == ordinal) {
                return t;
            }
        }
        return null;
    }
}
