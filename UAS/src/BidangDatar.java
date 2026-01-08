public class BidangDatar {
    private double panjang, lebar, sisi, jariJari, alas, tinggi, miring;

    public void setPersegi(double sisi) { this.sisi = sisi; }
    public void setPersegiPanjang(double p, double l) { this.panjang = p; this.lebar = l; }
    public void setLingkaran(double r) { this.jariJari = r; }
    public void setSegitiga(double a, double t) {
        this.alas = a;
        this.tinggi = t;
        this.miring = Math.sqrt((a * a) + (t * t));
    }

    public double luasPersegi() { return sisi * sisi; }
    public double kelilingPersegi() { return 4 * sisi; }

    public double luasPersegiPanjang() { return panjang * lebar; }
    public double kelilingPersegiPanjang() { return 2 * (panjang + lebar); }

    public double luasLingkaran() { return 3.14 * jariJari * jariJari; }
    public double kelilingLingkaran() { return 2 * 3.14 * jariJari; }

    public double luasSegitiga() { return 0.5 * alas * tinggi; }
    public double kelilingSegitiga() { return alas + tinggi + miring; }
}