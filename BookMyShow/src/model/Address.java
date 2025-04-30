package model;

public class Address {
    private String name;
    private String landmark;
    private double lat;
    private double lon;
    private int pincode;

    public Address(String name, String landmark, double lat, int pincode, double lon) {
        this.name = name;
        this.landmark = landmark;
        this.lat = lat;
        this.pincode = pincode;
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public String getLandmark() {
        return landmark;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public int getPincode() {
        return pincode;
    }
}
