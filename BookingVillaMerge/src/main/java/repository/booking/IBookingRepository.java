package repository.booking;

import model.Booking;

import java.util.List;

public interface IBookingRepository {
    List<Booking> getAllBooking();

    void updateBooking(int bookingIdApproved);

    void deleteBooking(int id);

}
