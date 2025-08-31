public class MainLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(44);
        list.insertLast(99);

        // list.insert(45, 3);
        list.display();
        // list.deleteFirst();
        // list.display();

        // System.out.println(list.deleteLast());
        // list.display();

        // System.out.println(list.deleteIndex(2));
        // list.display();

        // System.out.println(list.find(4));

        list.insertRec(2,3);
        list.display();
    }
}
