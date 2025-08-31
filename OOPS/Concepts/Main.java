package OOPS.Concepts;

public class Main {
    public static void main(String[] args) {
        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student manya = new Student();

        // manya.rollno = 819;
        // manya.name = "Manya Sachdeva";

        // manya.marks = 90.0f;

        System.out.println(manya.rollno);
        System.out.println(manya.name);
        System.out.println(manya.marks);
    }
}

class Student {
    int rollno;
    String name;
    float marks = 99;
}
