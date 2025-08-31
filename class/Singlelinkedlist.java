public class Singlelinkedlist {
    class Node{
        int rollno;
        Node next;
        Node(int rollno){
            this.rollno=rollno;
        }
    }
    Node head=null;
    Node current;
    public void  addNode(int roll) {
        Node newnode = new Node(roll);

        if (head == null) {
            head = newnode;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = newnode;
        }
    }

  public void addNodeAtStart(int roll)
  {
            Node newnode=new Node(roll);
            newnode.next=head;
            head=newnode;
   }
    public void countnodes(){
        int count =0;
        if(head==null){
            System.out.println("empty linked list");
        }
        else {
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            System.out.println("Number of nodes are " + count);

        }

        }
   public void  display()
    {
        if (head == null)
        {
            System.out.println("Empty linked list");
        } else
        {
            current = head;
            System.out.println("nodes are ");
            while (current != null)
            {
                System.out.print(current.rollno + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
        
        public static void main(String[] args){
            Singlelinkedlist l1=new Singlelinkedlist();
           l1.display();
            l1.addNode(70);
            l1.addNode(20);
            l1.addNode(50);
            l1.display();

            l1.addNodeAtStart(46);
            l1.display();
            l1.countnodes();


        }





        public void delete(int key){
         
        }

    }