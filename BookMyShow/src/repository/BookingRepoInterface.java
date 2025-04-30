package repository;

import model.Booking;

public interface BookingRepoInterface {
    void bookShow(Booking booking);
    Booking getBooking(String id);
}
