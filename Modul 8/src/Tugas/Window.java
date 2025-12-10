package Tugas;

public class Window {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void open() {
        System.out.println("Window dibuka");
    }

    public void close() {
        System.out.println("Window ditutup");
    }

    public void move() {
        System.out.println("Window dipindahkan");
    }

    public void display() {
        System.out.println("Menampilkan Window");
        if (shape != null) {
            shape.draw();
        }
    }

    public void handleEvent(Event e) {
        System.out.println("Menangani event: " + e.getEventName());
    }
}
