package service;

import model.Booking;

import java.util.List;

public interface IBookingService {
    List<Booking> getAllBooking();

    void updateBooking(int bookingIdApproved);

    void deleteBooking(int id);

}
