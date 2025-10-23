package Latihan_OCP;

public class CinemaMahasiswa extends Cinema {
    public CinemaMahasiswa(Double price) {
        this.price = price;
    }
    Double calculateAdminFee() {
        return price * 5 / 100;
    }
}
