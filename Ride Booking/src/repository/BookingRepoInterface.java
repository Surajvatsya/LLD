package repository;

import model.Booking;

public interface BookingRepoInterface {
    void book(Booking booking);
    Booking getBooking(String id);
}
