package service;

import model.Booking;
import repository.BookingRepoInterface;

public class BookingService implements BookingServiceInterface{

    BookingRepoInterface bookingRepoInterface;


    //remember this
    public BookingService(BookingRepoInterface bookingRepoInterface) {
        this.bookingRepoInterface = bookingRepoInterface;
    }

    @Override
    public void book(Booking booking) {
        bookingRepoInterface.book(booking);
    }

    @Override
    public void getBooKing(String id) {
        Booking booking = bookingRepoInterface.getBooking(id);
        System.out.println(booking);
    }
}
