package com.tomio.booking;

import com.tomio.car.Car;
import com.tomio.car.CarService;
import com.tomio.user.User;
import com.tomio.user.UserService;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class BookingService {
     final CarService carService;
     final UserService userService;

    private User user1;

    public BookingService(CarService carService, UserService userService) {
        this.carService = carService;
        this.userService = userService;
    }


    public  void bookCar() throws Exception {
        /*list available cars -
            returns all cars first time
            then remaining available  cars for the next times
//         */
        Car[] cars = carService.getCars();

        User[] users = userService.getUsers();


        for (Car car : cars) {
            System.out.println(car);

//        Scanner to select registration number
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals(car.getRegNumber())) {
                System.out.println(car + " was selected");
            }


            for (User user : users) {
                System.out.println(user);
                user1 = user;
            }
            Scanner scanner2 = new Scanner(System.in);
            String input2 = scanner2.nextLine();
            int inpute = parseInt(input2);

            if (inpute == user1.getId()) {
                System.out.println(user1 + " was selected");
            }


//        Select car by registration number
//        List all users
//        select user by id
//        book car
//        return a success or failure message


        }

//    private static void selectCarByRegNumber(Scanner scanner) {
//
//    }
    }
}
