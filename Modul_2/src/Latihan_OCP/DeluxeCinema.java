package Latihan_OCP;

public class DeluxeCinema extends Cinema {
    public DeluxeCinema(Double price) {
        this.price = price;
    }
    Double calculateAdminFee() {
        return price * 12 / 100;
    }

}
