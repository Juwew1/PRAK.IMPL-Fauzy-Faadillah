package LatihanDefensiveProgramming;

import java.io.*;

public class ExcepTest {

    public static void demoSingleCatch(int[] a) {
        try {
            System.out.println("Access element three:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the single catch block");
    }

    public int processFile(String fileName) {
        FileInputStream file = null;
        int x = 0;

        try {
            file = new FileInputStream(fileName);

            x = (byte) file.read();
        }
        catch (FileNotFoundException f) {
            System.out.println("\n[Multiple Catch]: File tidak ditemukan: " + fileName);
            f.printStackTrace();
            return -1;
        }
        catch (IOException i) {
            System.out.println("\n[Multiple Catch]: Masalah IO umum terjadi.");
            i.printStackTrace();
            return -1;
        }
        finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.err.println("Gagal menutup file.");
                }
            }
        }
        return x;
    }

    public static void main(String args[]) {
        int[] arr = new int[2];

        demoSingleCatch(arr);

        ExcepTest test = new ExcepTest();

        test.processFile("nonexistent_file_for_test.txt");
    }
}

