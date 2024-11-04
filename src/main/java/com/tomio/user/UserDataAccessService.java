package com.tomio.user;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class UserDataAccessService implements UserDAO {

    @Override
    public List<User> getUsers() throws IOException {
            File userFile = new File(Objects.requireNonNull(getClass().getClassLoader().getResource("users.txt")).getPath());

            List<User> users = new ArrayList<>();

            Scanner scanner = new Scanner(userFile);


            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] user = line.split(",");
                users.add(new User(parseInt(user[0]), user[1]));
            }
        return users;
    }
}
