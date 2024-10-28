package com.tomio.user;

import java.io.IOException;

public interface UserDAO {
    User[] getUsers() throws IOException;
}

