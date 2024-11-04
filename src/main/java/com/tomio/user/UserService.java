package com.tomio.user;

import java.io.IOException;
import java.util.List;

public class UserService {
    final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getUsers() throws IOException {
        return userDAO.getUsers();
    }

    public User getUser(int id) throws IOException {
        for (User user : getUsers()) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
