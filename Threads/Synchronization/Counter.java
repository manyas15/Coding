public class Counter {
    private int count = 0;

    public void increment(){
        synchronized(this){
            count++;
        }
    }// means we are making only this block synchronized so that only one thread can access this block at a time


// one instance on which increment method is called, if multiple threads are accessing it , then only one thread will be able
// to access it at a time

    public int getCount(){
        return count;
    }
}



// when synchronized is not used in this class that condition is called race condition.
// one thread only can access the critical section at a time - this condition is called mutual exclusion
// mutual exclusion ensures that only one thread can access the critical section at a time
// mutual means mutiple threads relations that want to access shared resource
// exclusion means to prevent