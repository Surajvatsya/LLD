package model;

public class Address {
    String id;
    String title;
    String landMark;
    double lat;
    double lon;

    public Address(String id, String title, String landMark, double lat, double lon) {
        this.id = id;
        this.title = title;
        this.landMark = landMark;
        this.lat = lat;
        this.lon = lon;
    }
}
