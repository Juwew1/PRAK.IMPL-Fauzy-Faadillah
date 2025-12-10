package Tugas;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    public User(String name, Group g) { this.name = name; }

    static class UserComparatorByDescendingRegistration implements Comparator<User> {
        public int compare(User u1, User u2) { return 0; }
    }
}

public class Group {

    public List<User> getUsersSortedByMostRecentlyRegistered() {
        List<User> users = new ArrayList<>();

        if (!userDirectoryExists())
            return users;

        addFoundUsersTo(users);
        sortByMostRecentlyRegistered(users);

        return users;
    }

    private boolean userDirectoryExists() {
        return new File(persistencePath()).exists();
    }

    private void addFoundUsersTo(List<User> users) {
        File[] files = new File(persistencePath()).listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    users.add(new User(file.getName(), this));
                }
            }
        }
    }

    private void sortByMostRecentlyRegistered(List<User> users) {
        Collections.sort(users, new User.UserComparatorByDescendingRegistration());
    }

    private String persistencePath() { return "./data"; }
}
