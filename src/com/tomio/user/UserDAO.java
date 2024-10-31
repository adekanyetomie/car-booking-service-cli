package com.tomio.user;

import java.io.IOException;
import java.util.List;

public interface UserDAO {
    List<User> getUsers() throws IOException;
}

