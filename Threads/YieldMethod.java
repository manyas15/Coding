public class YieldMethod extends Thread{

    public YieldMethod(String name){
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();   // tells the scheduler to pause the current thread and allow other threads to execute
        }
    }

    public static void main(String[] args) throws InterruptedException{
        YieldMethod t1 = new YieldMethod("t1");
        YieldMethod t2 = new YieldMethod("t2");

        t1.start();
        t2.start();
    }
}
