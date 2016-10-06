package ru.lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Охрана on 06.10.2016.
 */
public class UserRunner {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));
        users.add(new User("1", "first"));

        for (User user : users) {
            System.out.println(user);
        }
    }
}
