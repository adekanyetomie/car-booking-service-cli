package com.tomio.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingArrayDataAccessService {
    private static final List<Booking> bookings;

    static {
        bookings = new ArrayList<>() ;

    }

    public List <Booking> getBookings() {
        return bookings;
    }

    public void bookCar(Booking booking) {
       bookings.add(booking);
    }
}
