package org.fitsay.tourist_trips.Vouchers;

import java.util.Objects;

public class Voucher {
    protected String VoucherName;
    protected String DepartureFrom;
    protected String Country;
    protected String Hotel;
    protected String Date;
    protected int Duration;
    protected double price;
    protected VoucherType Type;

    public Voucher(String voucher, VoucherType type) {
        this.VoucherName = voucher;
        this.Type = type;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "VoucherName='" + VoucherName + '\'' +
                ", DepartureFrom='" + DepartureFrom + '\'' +
                ", Country='" + Country + '\'' +
                ", Hotel='" + Hotel + '\'' +
                ", Date='" + Date + '\'' +
                ", Duration=" + Duration +
                ", price=" + price +
                ", Type=" + Type +
                '}';
    }


    public String getVoucherName() {
        return VoucherName;
    }

    public void setVoucherName(String voucherName) {
        VoucherName = voucherName;
    }

    public String getDepartureFrom() {
        return DepartureFrom;
    }

    public void setDepartureFrom(String departureFrom) {
        DepartureFrom = departureFrom;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public VoucherType getType() {
        return Type;
    }

    public void setType(VoucherType type) {
        Type = type;
    }
}
