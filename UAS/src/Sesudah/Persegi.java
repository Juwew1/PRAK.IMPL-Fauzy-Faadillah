package Sesudah;

public class Persegi implements Shape {
    private double sisi;
    public Persegi(double sisi) { this.sisi = sisi; }
    @Override public double hitungLuas() { return sisi * sisi; }
    @Override public double hitungKeliling() { return 4 * sisi; }
    @Override public String getNama() { return "Persegi"; }
}