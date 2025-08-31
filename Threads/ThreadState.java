
public class ThreadState extends Thread {

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.println(t1.getState());          // with nothing written or not started will give NEW

        t1.start();
        System.out.println(t1.getState());          //will give RUNNABLE

        Thread.sleep(1000);
        System.out.println(t1.getState());

        t1.join();   // when t1 will execute completely
        System.out.println(t1.getState()); // after 2 sec TERMINATEDwill be printed
        //because main method was waiting t1 to get finished
    }

    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);               // because of this TIMED_WAITING state will be printed
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// there is no RUNNING state in java
// because in RUNNABLE state only java means either it is running or it is ready to run
