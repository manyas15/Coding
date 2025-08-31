import java.util.*;
public class Main {
    int [] arr;
    int front,rear,maxsize;
    
    public Main(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
        maxsize=size;
    }
    
    public boolean isFull(){
        return rear == maxsize-1;
    }
    
    public boolean isEmpty(){
        return front==-1;
    }
    
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = value;
        System.out.println("Enqueued: " + value);
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        
        int dequeuedValue = arr[front];
        if(front == rear){
            front = rear = -1;
        }
        else{
            front++;
        }
        return dequeuedValue;
        
    }
    
    public static void main(String[] args){
        Main q = new Main(5);
        q.enqueue(11);
        q.enqueue(22);
        q.enqueue(33);
        System.out.println("Dequeued: " + q.dequeue());
        
    }
    
}