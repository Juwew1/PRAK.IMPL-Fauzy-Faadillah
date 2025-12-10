package Tugas;

public class TugasMain {
    public static void main(String[] args) {
        System.out.println("=== TUGAS MODUL 8 ===");

        Window win = new Window();
        win.open();
        win.handleEvent(new Event());

        Circle circle = new Circle(10.5f, 0, 0);
        win.setShape(circle);
        win.display();

        ConsoleWindow console = new ConsoleWindow();

        DialogBox dialog = new DialogBox();
        DataController dataCtrl = new DataController();
        dialog.setController(dataCtrl);
        dataCtrl.saveData();

        DrawingContext dc = new DrawingContext();
        dc.clearScreen();
    }
}
