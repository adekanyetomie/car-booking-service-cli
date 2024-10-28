package com.tomio;

import com.tomio.booking.BookingService;
import com.tomio.car.Car;
import com.tomio.car.CarArrayDataAccessService;
import com.tomio.car.CarService;
import com.tomio.user.User;
import com.tomio.user.UserArrayDataAccessService;
import com.tomio.user.UserService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        //dependency injection
        CarArrayDataAccessService carArrayDataAccessService = new CarArrayDataAccessService();
        CarService carService = new CarService(carArrayDataAccessService);

        UserArrayDataAccessService userArrayDataAccessService = new UserArrayDataAccessService();
        UserService userService = new UserService(userArrayDataAccessService);

        BookingService bookingService = new BookingService(carService, userService);




        //Users
        User[] users = userService.getUsers();
        System.out.println(Arrays.toString(users));


//        for (User user : users) {
//            System.out.println(user.toString());
//        }

        //Cars

        Car[] cars = carService.getCars();
        for (Car car : cars) {
//            System.out.println(car);

            if (car.getElectric()) {
                System.out.println(car);
            }
        }

        System.out.println("""
                1️⃣ - Book Car
                2️⃣ - View All User Booked Cars
                3️⃣ - View All Bookings
                4️⃣ - View Available Cars
                5️⃣ - View Available Electric Cars
                6️⃣ - View all users
                7️⃣ - Exit""");
    }


}