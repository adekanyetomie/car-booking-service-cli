package com.tomio.booking;

public class BookingDAO {
    private static final Booking[] bookings;

    static {
        bookings = new Booking[] {
                new Booking()
        };
    }

    public static Booking[] getBookings() {
        return bookings;
    }
}
