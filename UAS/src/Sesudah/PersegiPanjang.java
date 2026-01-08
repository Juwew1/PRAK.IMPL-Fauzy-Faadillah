package Sesudah;

public class PersegiPanjang implements Shape {
    private double panjang, lebar;
    public PersegiPanjang(double p, double l) { this.panjang = p; this.lebar = l; }
    @Override public double hitungLuas() { return panjang * lebar; }
    @Override public double hitungKeliling() { return 2 * (panjang + lebar); }
    @Override public String getNama() { return "Persegi Panjang"; }
}