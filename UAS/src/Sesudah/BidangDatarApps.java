package Sesudah;
import java.util.Scanner;

public class BidangDatarApps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Bidang Datar:");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga Siku-Siku");
        System.out.print("Input pilihan: ");
        int pilihanDatar = scanner.nextInt();

        Shape shape = null;

        if (pilihanDatar == 1) {
            System.out.print("Masukan Jari-jari: ");
            shape = new Lingkaran(scanner.nextDouble());
        } else if (pilihanDatar == 2) {
            System.out.print("Masukan Sisi Persegi: ");
            shape = new Persegi(scanner.nextDouble());
        } else if (pilihanDatar == 3) {
            System.out.print("Masukan Panjang: ");
            double p = scanner.nextDouble();
            System.out.print("Masukan Lebar: ");
            double l = scanner.nextDouble();
            shape = new PersegiPanjang(p, l);
        } else if (pilihanDatar == 4) {
            System.out.print("Masukan Alas: ");
            double a = scanner.nextDouble();
            System.out.print("Masukan Tinggi: ");
            double t = scanner.nextDouble();
            shape = new SegitigaSikuSiku(a, t);
        }

        if (shape != null) {
            System.out.println("Pilih Hitung Keliling atau Luas:");
            System.out.println("1. Keliling");
            System.out.println("2. Luas");
            System.out.print("Input pilihan: ");
            int pilihanHitung = scanner.nextInt();

            if (pilihanHitung == 1) {
                System.out.println("Keliling " + shape.getNama() + " adalah " + shape.hitungKeliling());
            } else if (pilihanHitung == 2) {
                System.out.println("Luas " + shape.getNama() + " adalah " + shape.hitungLuas());
            }
        }
        scanner.close();
    }
}