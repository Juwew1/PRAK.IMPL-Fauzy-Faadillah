package Tugas;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {

    public List<String> getUsersSortedByMostRecentlyRegistered() {
        List<String> users = new ArrayList<>();

        if (!userDirectoryExists())
            return users;

        addFoundUsersTo(users);
        sortByMostRecentlyRegistered(users);

        return users;
    }

    private boolean userDirectoryExists() {
        return new File(persistencePath()).exists();
    }

    private void addFoundUsersTo(List<String> users) {
        File[] files = new File(persistencePath()).listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    users.add(file.getName());
                }
            }
        }
    }

    private void sortByMostRecentlyRegistered(List<String> users) {
        Collections.sort(users);
    }

    private String persistencePath() { return "."; }
}