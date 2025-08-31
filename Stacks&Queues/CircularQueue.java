
public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int start = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return -1; // Or any value that signals "nothing to return"
        }
        int removed = data[start++];
        start = start % data.length;
        size--;

        return removed;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1; // Again, pick a value that makes sense in your app
        }
        return data[start];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = start;
        do {
            System.out.println(data[i] + "->");
            i++;
            i %= data.length;
        } while (i != end);

        System.out.println("End");
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5); // Create a circular queue of size 5

        // Inserting elements into the queue
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50); // Queue is now full

        System.out.println("Initial Queue:");
        queue.display();

        // Trying to insert into a full queue
        boolean inserted = queue.insert(60);
        if (!inserted) {
            System.out.println("Queue is full. Cannot insert 60.");
        }

        // Checking the front element
        int front = queue.front();
        if (front != -1) {
            System.out.println("Front element: " + front);
        }

        // Removing elements
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        System.out.println("Queue after removing two elements:");
        queue.display();

        // Inserting again to test circular behavior
        queue.insert(60);
        queue.insert(70);

        System.out.println("Queue after inserting 60 and 70:");
        queue.display();

        // Removing all elements
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.remove());
        }

        // Trying to remove from an empty queue
        queue.remove();

        // Trying to access front on an empty queue
        queue.front();
    }
}
