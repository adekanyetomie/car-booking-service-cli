package com.tomio.user;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UserArrayDataAccessService implements UserDAO {

    @Override
    public User[] getUsers() throws IOException {
            File userFile = new File("src/com/tomio/user/users.csv");
            Scanner scanner = new Scanner(userFile);

        int lines = 0;
        Scanner lineCounter = new Scanner(userFile);
        while (lineCounter.hasNextLine()) {
            lineCounter.nextLine();
            lines++;
        }
        lineCounter.close();

        User[] users = new User[lines];

            int i = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] user = line.split(",");
                int id = Integer.parseInt(user[0].trim());
                String name = user[1].trim();

                users[i] = new User(id, name);
                i++;

            }

        return users;
    }


}
