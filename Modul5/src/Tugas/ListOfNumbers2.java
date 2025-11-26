package Tugas;

import java.io.*;
import java.util.Vector;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListOfNumbers2 {
    private Vector victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector(size);
        for (int i = 0; i < size; i++)
            victor.addElement(new Integer(i));

        try {
            if (!Files.exists(Paths.get("infile.txt"))) {
                Files.write(Paths.get("infile.txt"), "0\n1\n2\nabc\n4".getBytes());
            }
        } catch (IOException e) {
            System.err.println("Gagal membuat file input dummy: " + e.getMessage());
        }

        try {
            this.readList("infile.txt");
        } catch (IOException e) {
            System.err.println("Gagal membaca file: " + e.getMessage());
        }

        this.writeList();
    }

    public void readList(String fileName) throws IOException {
        String line = null;
        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                try {
                    Integer i = Integer.parseInt(line);
                    victor.addElement(i);
                    System.out.println("Dibaca: " + i);
                } catch (NumberFormatException e) {
                    System.err.println("Peringatan: Format angka tidak valid pada baris '" + line + "'. Skip baris.");
                }
            }
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.err.println("Gagal menutup RandomAccessFile: " + e.getMessage());
                }
            }
        }
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
            for (int i = 0; i < victor.size(); i++) {
                if (i >= victor.size()) {
                    throw new ArrayIndexOutOfBoundsException("Indeks melebihi batas Vector.");
                }
                out.println("Value at: " + i + " = " + victor.elementAt(i));
            }
        } catch (IOException e) {
            System.err.println("Error IO saat menulis file: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Kesalahan batas array: " + e.getMessage());
        } finally {
            if (out != null) {
                out.close();
                System.out.println("Closing Print Writer");
            } else {
                System.out.println("Printwriter not open");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}