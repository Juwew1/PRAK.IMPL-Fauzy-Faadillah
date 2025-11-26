package Tugas;

import java.io.*;
import java.util.Vector;

public class ListOfNumbers2Original {
    private Vector victor;
    private static final int size = 10;

    public ListOfNumbers2Original() {
        victor = new Vector(size);
        for (int i = 0; i < size; i++)
            victor.addElement (new Integer(i));
        this.readList("infile.txt");
        this.writeList();
    }

    public void readList (String fileName) {
        String line = null;
        RandomAccessFile raf = new RandomAccessFile (fileName, "r");
        while ((line = raf.readLine()) != null) {
            Integer i = new Integer (Integer.parseInt(line));
            System.out.println(i);
        }
    }

    public void writeList() {
        PrintWriter out = null;
        out = new PrintWriter(new FileWriter ("outfile.txt"));
        for (int i=0; i < victor.size(); i++)
            out.println("Value at: " + i + " = " + victor.elementAt(i));
    }

    public static void main(String[] args) {
        new ListOfNumbers2Original();
    }
}
