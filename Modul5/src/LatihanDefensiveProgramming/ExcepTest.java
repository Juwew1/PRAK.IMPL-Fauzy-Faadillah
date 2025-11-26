package LatihanDefensiveProgramming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepTest {

    FileInputStream file = null;
    int x = 0;
    String fileName = "input.txt";

    public static void main(String args[]) {
        ExcepTest test = new ExcepTest();

        try {
            int a[] = new int[2];
            System.out.println("Access element three:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown (Index):" + e);
        }
        System.out.println("Out of the first block");

        test.processFile();
    }

    public void processFile() {
        try {
            file = new FileInputStream(fileName);
            x = (byte) file.read();

        } catch (IOException i) {
            i.printStackTrace();

            if (file != null) {
                try { file.close(); } catch (IOException ignored) {}
            }
            return;

        } catch (FileNotFoundException f) {
            f.printStackTrace();
            return;
        }

        System.out.println("File processed successfully.");
    }
}
