package model;

public class Address {
    private final String name;
    private final double lat;
    private final double lon;
    private final int pincode;

    public Address(String name, double lat, int pincode, double lon) {
        this.name = name;
        this.lat = lat;
        this.pincode = pincode;
        this.lon = lon;
    }


}
