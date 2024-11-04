package com.tomio.booking;

import com.tomio.car.Car;
import com.tomio.user.User;

import java.util.Date;

public class Booking {
    private String bookingId;
    private User user;
    private Car car;
//    private Date date;

    public Booking(){}

    public Booking(String bookingId, User user, Car car) {
        this.bookingId = bookingId;
        this.user = user;
        this.car = car;
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}
