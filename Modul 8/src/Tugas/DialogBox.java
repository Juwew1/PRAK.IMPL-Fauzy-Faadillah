package Tugas;

public class DialogBox extends Window {
    private DataController controller;

    public void setController(DataController controller) {
        this.controller = controller;
    }

    public void showDialog() {
        System.out.println("Menampilkan Dialog Box");
    }
}
