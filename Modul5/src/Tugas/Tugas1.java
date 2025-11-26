package Tugas;

public class Tugas1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Error: Tidak bisa membagi dengan nol.");
        }
    }
}
