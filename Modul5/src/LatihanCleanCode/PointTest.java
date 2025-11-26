package LatihanCleanCode;

public class PointTest implements Point {
    private double x = 0;
    private double y = 0;

    @Override
    public double getX() { return x; }
    @Override
    public double getY() { return y; }
    @Override
    public void setCartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getR() { return Math.sqrt(x * x + y * y); }
    @Override
    public double getTheta() { return Math.atan2(y, x); }
    @Override
    public void setPolar(double r, double theta) {
        this.x = r * Math.cos(theta);
        this.y = r * Math.sin(theta);
    }

    public static void main(String[] args) {
        PointTest p = new PointTest();
        p.setCartesian(3, 4);
        System.out.println("Pengujian Point Interface (R): " + p.getR());
    }
}
