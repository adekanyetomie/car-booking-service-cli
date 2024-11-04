package com.tomio.booking;

import com.tomio.car.Car;
import com.tomio.car.CarService;
import com.tomio.user.User;
import com.tomio.user.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class BookingService {
     final CarService carService;
     final BookingArrayDataAccessService bookingArrayDataAccessService;
     final UserService userService;

    private User user1;

    public BookingService(CarService carService, UserService userService, BookingArrayDataAccessService bookingArrayDataAccessService) {
        this.carService = carService;
        this.userService = userService;
        this.bookingArrayDataAccessService = bookingArrayDataAccessService;
    }

    public List<Booking> bookings() {
        return bookingArrayDataAccessService.getBookings();
    }

    public List<Car> getAllCars(List<Car> cars) {
        if (cars.isEmpty()) { // checks if we have cars
            return null;
        }

        List<Booking> bookings = bookingArrayDataAccessService.getBookings();
        if (bookings.isEmpty()) { // checks if there are bookings if not all cars are available
            return  cars;
        }

        List<Car> result = new ArrayList<Car>();
// checks if the car at that index is booked if not add to result and if true set the car to booked
        for (Car car : cars) {
            boolean booked = false;
            for (Booking booking : bookings) {
                if (booking == null || booking.getCar().equals(car)){
                    continue;
                }
                booked = true;
            }
            if(!booked) {
                result.add(car);
            }
        }
        return result;

    }

    public List<Car> getCars() {
        return getAllCars(carService.getCars());
    }

    public List<Car> getElectricCars(){
        return getAllCars(carService.getElectricCars());
    }

    public List<Car> getUserBookedCars(int id) {
        List<Booking> bookings = bookingArrayDataAccessService.getBookings();
        List<Car> result = new ArrayList<Car>();
        for (Booking booking : bookings) {
            if (booking.getUser().getId() == id ) {
                result.add(booking.getCar());
            }
        }
        return result;
    }

    public String bookCar(User user, String regNumber) throws Exception {

        List<Car> cars = getCars();
        if (cars.isEmpty()) {
            throw new Exception("No cars found");
        }

        for (Car car : cars) {
            if(car.getRegNumber().equals(regNumber)) {
                Car userCar = carService.getCarById(regNumber);
                String bookingId = UUID.randomUUID().toString();
                bookingArrayDataAccessService.bookCar(new Booking(bookingId, user, userCar ));
                return bookingId;
            }
        }
        throw new Exception("Car with reg number " + regNumber + " is already booked");

    }
}
