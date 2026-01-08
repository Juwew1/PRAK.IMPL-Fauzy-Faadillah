package Sesudah;

public class SegitigaSikuSiku implements Shape {
    private double alas, tinggi, miring;
    public SegitigaSikuSiku(double a, double t) {
        this.alas = a;
        this.tinggi = t;
        this.miring = Math.sqrt((a * a) + (t * t));
    }
    @Override public double hitungLuas() { return 0.5 * alas * tinggi; }
    @Override public double hitungKeliling() { return alas + tinggi + miring; }
    @Override public String getNama() { return "Segitiga Siku-Siku"; }
}