package repository;

import model.Booking;

import java.util.HashMap;

public class BookingRepo implements BookingRepoInterface{

    private HashMap<String, Booking> bookingHashMap = new HashMap<>();

    @Override
    public void bookShow(Booking booking) {
        bookingHashMap.put(booking.getId(), booking);
    }

    @Override
    public Booking getBooking(String id) {
            return bookingHashMap.get(id);
    }
}
