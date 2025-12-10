package Tugas;

import java.util.List;

public class TugasMain {
    public static void main(String[] args) {
        System.out.println("=== TEST REFALCTORING CLASS GROUP ===");

        Group group = new Group();
        List<User> users = group.getUsersSortedByMostRecentlyRegistered();

        System.out.println("Proses getUsersSortedByMostRecentlyRegistered berhasil dijalankan.");
        System.out.println("Jumlah user ditemukan: " + users.size());
    }
}
