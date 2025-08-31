public class Test {
    public static void main(String[] args) {
        //there are 2 threads t1 amd t2 and there is a common source - counter(dono mein ek hi object share kiya hua h)
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){

        }
        System.out.println(counter.getCount());
    }
}

/*Answer should come 2000 but as we are sharing object between 2 threads and sometimes in between counter.increment() of both
/threads happended at the same time
/2000 can come but there is no surity
/but if we write synchronized key word in public void increment() method in Counter class then it will 2000 everytime
 we run the program */
