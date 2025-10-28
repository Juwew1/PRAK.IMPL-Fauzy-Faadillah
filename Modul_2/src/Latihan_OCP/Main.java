package Latihan_OCP;

public class Main {
    public static void main(String[] args) {
        StandardCinema standardCinema = new StandardCinema(100.0);
        Double adminFee = standardCinema.calculateAdminFee();
        CinemaMahasiswa cinemaMahasiswa = new CinemaMahasiswa(100.0);
        adminFee = cinemaMahasiswa.calculateAdminFee();
        System.out.println(adminFee);
    }

}
