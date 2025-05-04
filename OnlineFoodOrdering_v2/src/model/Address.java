package model;

import java.util.Objects;

// Consider making this a record (Java 16+) for automatic getters, equals, hashCode, toString
// public record Address(String name, double lat, double lon, int pincode) {}
// If using older Java:
public class Address {
    private final String name;
    private final double lat;
    private final double lon;
    private final int pincode;

    // Grouped lat/lon together in constructor params for convention
    public Address(String name, double lat, double lon, int pincode) {
        // Add null/empty check for name if needed
        this.name = Objects.requireNonNull(name, "Address name cannot be null");
        this.lat = lat;
        this.lon = lon;
        // Add validation for pincode if needed (e.g., format/range)
        this.pincode = pincode;
    }

    // --- Getters ---
    public String getName() {
        return name;
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

    // --- equals, hashCode, toString (important for value objects) ---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Double.compare(address.lat, lat) == 0 &&
               Double.compare(address.lon, lon) == 0 &&
               pincode == address.pincode &&
               Objects.equals(name, address.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lat, lon, pincode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", pincode=" + pincode +
                '}';
    }
}
