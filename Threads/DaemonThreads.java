// Daemon Threads are the type of threads that run in background -> like in java - garbage collector
// problem is that JVM will not wait for them 

public class DaemonThreads extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        DaemonThreads daemonThread = new DaemonThreads();
        daemonThread.setDaemon(true);
        daemonThread.start();                  // we have made it in runnable state

        //DaemonThreads t1 = new DaemonThreads();
        //t1.start();                         -> writing this will make the code run infinity times becoz it is a user thread
        System.out.println("Main done");
    }
}

// daemonThread.setDaemon(true); -> means u have set daemon and now System.out.println("hello"); this statement will
// run in background there is no importance of it