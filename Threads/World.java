public class World extends Thread{
    @Override
    public void run(){
        for(; ; ){                            //infinite loop
            System.out.println("World");
            //System.out.println(Thread.currentThread().getName());    -->> will print thread - 0
        }
    }
}

//we will make a world object in test class to see whether threads run simultaneously or not
// there will be no specific order -> because there are 2 independent works


// if we write public class World implements Runnable 
// then in test file we have to write ->
// World world = new World();
// Thread t1 = new Thread();  ->we have to make a thread then // we have to make a thread object and then we have to pass the instance of the world class
// then t1.start();

// in both cases run method contains the code that will be executed in the new Thread
