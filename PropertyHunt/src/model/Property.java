package model;
import java.math.BigDecimal;
import java.util.*;

import java.time.LocalDateTime;

public class Property extends IdAndTime {
    private Double propertySize;
    private String propertyUnit;
    List<Room> rooms;
    PropertyType propertyType;
    boolean isAvailable;
    PropertyStatus propertyStatus;
    Address address;
    List<Address> nearByLocality;
    User user;
    long price;
//    private

    public Property(long id, LocalDateTime createdAt, LocalDateTime updatedAt, Double propertySize, String propertyUnit, List<Room> rooms, boolean isAvailable, PropertyType propertyType, PropertyStatus propertyStatus, Address address, User user, List<Address> nearByLocality,long price) {
        super(id, createdAt, updatedAt);
        this.propertySize = propertySize;
        this.propertyUnit = propertyUnit;
        this.rooms = rooms;
        this.isAvailable = isAvailable;
        this.propertyType = propertyType;
        this.propertyStatus = propertyStatus;
        this.address = address;
        this.user = user;
        this.nearByLocality = nearByLocality;
        this.price = price;
    }

    public Double getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Double propertySize) {
        this.propertySize = propertySize;
    }

    public String getPropertyUnit() {
        return propertyUnit;
    }

    public void setPropertyUnit(String propertyUnit) {
        this.propertyUnit = propertyUnit;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRooms(Room room) {
        this.rooms.add(room);
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public PropertyStatus getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(PropertyStatus propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getNearByLocality() {
        return nearByLocality;
    }

    public void addNearByLocality(Address nearByLocality) {
        this.nearByLocality.add(nearByLocality) ;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
