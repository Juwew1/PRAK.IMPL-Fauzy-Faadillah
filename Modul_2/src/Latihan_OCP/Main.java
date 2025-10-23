package Latihan_OCP;

public class Main {
    public static void main(String[] args) {
        CinemaMahasiswa cinemaMahasiswa = new CinemaMahasiswa(100.0);
        Double adminFee = cinemaMahasiswa.calculateAdminFee();
        System.out.println(adminFee);
    }

}
