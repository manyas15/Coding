package OOPS.Concepts;

public class ConstructorOverLoading {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student2[] students = new Student2[5];
        
        Student2 manya = new Student2(15, "Manya", 85.4f);

        System.out.println(manya.rollno);
        System.out.println(manya.name);
        System.out.println(manya.marks);

        Student2 random = new Student2(manya);
        System.out.println(random.name);

        Student2 random2 = new Student2();
        System.out.println(random2.name);

        Student2 one = new Student2();
        Student2 two = one;

        one.name = "something";
        System.out.println(two.name);
    }
}

class Student2 {
    int rollno;
    String name;
    float marks = 99;

    // Student2() {
    //     this.rollno = 13;
    //     this.name = "Manya Sachdeva";
    //     this.marks = 90.7f;
    // }

    Student2(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    
    Student2 (Student2 other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student2(){
         // this is how you call a constructor from another constructor
         // internally: new Student (13, "default person", 100.0f);
        this(12, "default" , 100.0f);
    }
}
