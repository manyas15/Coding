package OOPS.Polymorphism;

public class Circle extends Shapes {

    // this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
              // used for check purposes

    void area() {
        System.out.println("area is pie * r * r");
    }
}
