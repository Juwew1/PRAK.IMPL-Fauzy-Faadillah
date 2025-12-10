package Latihan;

public class LatihanMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Budi");

        Assignment a1 = new Assignment();
        a1.setMark(85.5);

        CourseRecord cr = new CourseRecord();
        cr.setStudent(s1);
        cr.addAssignment(a1);

        Course c = new Course();
        c.setTitle("Pemrograman Java");
        c.addCourseRecord(cr);

        System.out.println("Berhasil membuat Course: " + c.getTitle());
        System.out.println("Mahasiswa: " + cr.getStudent().getName());
        try {
            System.out.println("Nilai: " + a1.getMark());
        } catch (NotYetSetException e) {
            System.out.println(e.getMessage());
        }
    }
}
