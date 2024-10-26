package com.tomio.user;

public class UserService {

    public User[] getUsers() {
       return UserDAO.getUsers();
    }
}
