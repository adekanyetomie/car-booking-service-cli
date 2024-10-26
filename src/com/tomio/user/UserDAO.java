package com.tomio.user;

public class UserDAO {
    private static final User[] users;

     static {
        users = new User[] {
                new User(1, "Tomi"),
                new User(2, "Dami")
     };
    }
    public static User[] getUsers() {
         return users;
    }
}
