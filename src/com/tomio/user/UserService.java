package com.tomio.user;

import java.io.IOException;

public class UserService {
    final UserArrayDataAccessService userArrayDataAccessService;

    public UserService(UserArrayDataAccessService userArrayDataAccessService) {
        this.userArrayDataAccessService = userArrayDataAccessService;
    }

    public User[] getUsers() throws IOException {
        return userArrayDataAccessService.getUsers();
    }
}
