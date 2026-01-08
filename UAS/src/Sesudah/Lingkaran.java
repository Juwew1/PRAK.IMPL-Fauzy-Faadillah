package Sesudah;

public class Lingkaran implements Shape {
    private double jariJari;
    public Lingkaran(double r) { this.jariJari = r; }
    @Override public double hitungLuas() { return 3.14 * jariJari * jariJari; }
    @Override public double hitungKeliling() { return 2 * 3.14 * jariJari; }
    @Override public String getNama() { return "Lingkaran"; }
}