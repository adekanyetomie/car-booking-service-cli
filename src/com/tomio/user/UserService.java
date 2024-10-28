package com.tomio.user;

import java.io.IOException;

public class UserService {

    public User[] getUsers() throws IOException {
        UserArrayDataAccessService userArrayDataAccessService = new UserArrayDataAccessService();
        return userArrayDataAccessService.getUsers();
    }
}
