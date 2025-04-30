package model;

public class Address {
    private String name;
    private double lat;
    private double lon;
    private int pincode;

    public Address(String name, double lat, double lon, int pincode) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.pincode = pincode;
    }

}
