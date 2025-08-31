
public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                account.withdraw(50);
            }
        };   //anonymous class has been created here
        // not using thread class here but runnable interface
        Thread t1 = new Thread(task, "thread 1");
        Thread t2 = new Thread(task, "thread 2");
        t1.start();
        t2.start();
    }
}
