package org.fitsay.tourist_trips.Vouchers;

public class Voucher {
    protected String VoucherName;
    protected String DepartureFrom;
    protected String Country;
    protected String Hotel;
    protected String Date;
    protected int Duration;
    protected double price;
    protected VoucherType Type;

    Voucher(String carName, VoucherType type) {
        this.VoucherName = carName;
        this.Type = type;
    }
    @Override
    public String toString(){
        return  "----------------------------------------"+"\n"+VoucherName +":"+
                "\n    Price($): " + price;
    }
}
