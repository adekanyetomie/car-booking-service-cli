package com.tomio.booking;

import com.tomio.car.Car;
import com.tomio.car.CarDao;
import com.tomio.user.User;
import com.tomio.user.UserDAO;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class BookingService {

    private static Car car1;
    private static User user1;

    public static void bookCar() {
        /*list available cars -
            returns all cars first time
            then remaining available  cars for the next times
         */
        Car[]  cars = CarDao.getCars();
        User[] users = UserDAO.getUsers();
          for (Car car : cars) {
            System.out.println(car);
           car1 = car;

//        Scanner to select registration number
        Scanner scanner = new Scanner(System.in);
          String input = scanner.nextLine();

          if (input.equals(car1.getRegNumber())) {
              System.out.println(car1 + " was selected");
          }


              for (User user : users) {
            System.out.println(user);
                  user1 = user;
              }
        Scanner scanner2 = new Scanner(System.in);
          String input2 = scanner2.nextLine();
          int inpute = parseInt(input2);

          if(inpute == user1.getId()){
              System.out.println(user1 + " was selected");
          }


//        Select car by registration number
//        List all users
//        select user by id
//        book car
//        return a success or failure message


    }

//    private static void selectCarbyRegNumber(Scanner scanner) {
//
//    }
}
}
