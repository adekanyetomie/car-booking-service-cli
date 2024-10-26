package com.tomio;

import com.tomio.car.Car;
import com.tomio.car.CarService;
import com.tomio.user.User;
import com.tomio.user.UserService;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        UserService userService = new UserService();

        //Users
        User[] users = userService.getUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }

        //Cars
        Car[] cars = CarService.getCars();
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