package controller;

import model.Booking;
import service.BookingServiceInterface;

public class BookingController {
    private BookingServiceInterface bookingServiceInterface;

    public BookingController(BookingServiceInterface bookingServiceInterface) {
        this.bookingServiceInterface = bookingServiceInterface;
    }

    public void createBooking(Booking booking){
        bookingServiceInterface.book(booking);
    }

    public void getBooking(String bookingId){
        bookingServiceInterface.getBooKing(bookingId);
    }


}
