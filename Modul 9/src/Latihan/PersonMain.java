package Latihan;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Fauzy Faadillah");
        System.out.println("Nama Person: " + person.getName());

        person.setName("Ricky Gunaldo");
        System.out.println("Nama Baru: " + person.getName());
    }
}