public class MainCll {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(6);
        list.insert(4);
        list.insert(7);
        list.insert(8);
        list.insert(63);
        list.display();

        list.delete(7);
        list.display();
        
    }
}
