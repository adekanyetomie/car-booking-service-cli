package com.tomio.user;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class UserFakerDataAccessService implements UserDAO {

    @Override
    public List<User> getUsers() {
        Faker faker = new Faker();
        Random random = new Random();

        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new User(random.nextInt(20), faker.name().fullName()));
        }
        return users;
    }
}
