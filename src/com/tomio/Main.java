package com.tomio;

import com.tomio.booking.BookingArrayDataAccessService;
import com.tomio.booking.BookingService;
import com.tomio.car.CarArrayDataAccessService;
import com.tomio.car.CarService;
import com.tomio.user.UserDataAccessService;
import com.tomio.user.UserService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //dependency injection
        CarArrayDataAccessService carArrayDataAccessService = new CarArrayDataAccessService();
        CarService carService = new CarService(carArrayDataAccessService);

        UserDataAccessService userArrayDataAccessService = new UserDataAccessService();
        UserService userService = new UserService(userArrayDataAccessService);

        BookingArrayDataAccessService bookingArrayDataAccessService = new BookingArrayDataAccessService();
        BookingService bookingService = new BookingService(carService, userService, bookingArrayDataAccessService);

        Scanner scanner = new Scanner(System.in);


    }

    private  static void printMenu(){
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

