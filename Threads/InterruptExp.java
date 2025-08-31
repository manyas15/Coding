
public class InterruptExp extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            System.out.println("Thread is running.....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        InterruptExp t1 = new InterruptExp();

        t1.start();
        t1.interrupt();
    }
}

// Exception -> sleep was happening which we have interrupted
// we were stoping it for 1 sec but then we interrupted it by main method only
// now System.out.println("Thread is running....."); this line will not be printed and
// System.out.println("Thread interrupted: " + e); this exception will be thrown