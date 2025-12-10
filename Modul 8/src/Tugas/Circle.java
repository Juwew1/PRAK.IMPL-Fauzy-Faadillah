package Tugas;

public class Circle extends Shape {
    private float radius;
    private int center;

    private Point point;

    public Circle(float radius, int x, int y) {
        this.radius = radius;
        this.point = new Point(x, y);
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public void circum() {
        System.out.println("Menghitung keliling lingkaran...");
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Lingkaran");
    }

    @Override
    public void erase() {
        System.out.println("Menghapus Lingkaran");
    }

    @Override
    public void move() {
        System.out.println("Memindahkan Lingkaran");
    }

    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Lingkaran");
    }
}
