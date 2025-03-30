package model;

public class Address {
    private long pinCode;
    private double lat;
    private double lon;

    public Address(long pinCode, double lat, double lon) {
        this.pinCode = pinCode;
        this.lat = lat;
        this.lon = lon;
    }
}
