package model;

import java.time.LocalDateTime;
import java.util.*;

public class User extends BaseClass{
    private String name;
    private String email;
    private String contact;
    private Address address;
    int totalBookingCounter;
    private List<Booking> bookingsList;

    public User(String name, String email, String contact, Address address, String id, LocalDateTime createdAt, LocalDateTime updatedAt) {
        // IMPO
        super(id,createdAt,updatedAt);
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.totalBookingCounter = 0;
        this.address = address;
        this.bookingsList = new ArrayList<>();
    }

    public void addToBookingsList(Booking booking) {
        this.bookingsList.add(booking);
    }

    public List<Booking> getBookingsList() {
        return bookingsList;
    }

    public void cancelBooking(Booking booking){
        //ask remove from booking
        bookingsList.remove(booking);
    }


    // Donot need to over ride here
    //    @Override
//    public String getId() {
//        return super.getId();
//    }
}
