
public class Test {

    public static void main(String[] args) {

        World world = new World();
        world.start();

        for(; ; ){
            System.out.println("hello");
        }
       // System.out.println(Thread.currentThread().getName());    -->> will print main
    }
}
// these type of threads are called user Threads -> simply means threads which are creating
// the work that you are getting done ,you are getting it done with the help of user threads


// #####World.java file -> explanation