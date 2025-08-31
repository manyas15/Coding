// package OOPS.Inheritance;

public class Box {

    double l;
    double w;
    double h;
    // double weight;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public static void main(String[] args) {
        Box box = new Box(2, 5, 7);
        System.out.println(box.l + " " + box.w + " " + box.h);

        // Box box1 = new Box(box); constructor in constructor

        BoxWeight box2 = new BoxWeight(2, 4, 6, 7);
        System.out.println(box2.l + " " + box2.weight);

        Box box3 = new BoxWeight(2, 5, 6, 7);
        // System.out.println(box3.weight); --> this will give error
        /*
         * becoz it is the type of ref variable and not the type of object
         * that determines what members can be accessed
         */
        System.out.println(box3.w);
    }
}
