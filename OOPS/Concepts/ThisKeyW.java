package OOPS.Concepts;

public class ThisKeyW {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student1[] students = new Student1[5];

        Student1 manya = new Student1();

        manya.changeName("Paint lover");
        manya.greeting();

        System.out.println(manya.rollno);
        System.out.println(manya.name);
        System.out.println(manya.marks);

        Student1 random = new Student1();

    }
}

class Student1 {
    int rollno;
    String name;
    float marks = 99;

    void greeting() {
        System.out.println("hello i am " + this.name);
    }
    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void changeName(String newName) {
        name = newName;
    }

    Student1() {
        this.rollno = 13;
        this.name = "Manya Sachdeva";
        this.marks = 90.7f;
    }

    Student1(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}
