package OOPS.Concepts;

public class WrapperClass {
    public static void main(String[] args) {
        final A manya = new A("something");
        manya.name = "Manya Sachdeva";          //values can be changed
        //but cannot be reassigned

        // manya = new A("manya sachdeva");    // cannot do this
    }
}

class A{
    //final keyword 
    //value canoot be changed
    final int num = 8;      //always initialise it while declaring
    String name; 

    // constructor

    public A(String name){
        this.name = name;
    }
}
