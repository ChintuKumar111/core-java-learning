package collectionFramework;



public class AddFirstLastInLinkedList {
    public static void main(String args[]) {
        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(6);
        list.PrintValue();
    }
}
class Node{
      Node1 next;
      int data;
      Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    class MyList {
        Node1 head;
        public void add(int data) {
            Node1 newNode = new Node1(data);
            if(head==null) {
                head=newNode;
                return;
            }
            Node1 current = head;
            while(current.next!=null) {
                current = current.next;
            }
            current.next= newNode;
        }
       public void addFirst(int data)
        {
            Node1 headNode  = new Node1(data);
            if(head ==null)
            {
                head=headNode;
                return;
            }
            Node1 current = head;
            headNode.next=head;
            head= headNode;        }
        public void PrintValue() {
            Node1 current = head;
            if(head == null) {System.out.println("List is empty");}
            while(current!=null) {
                System.out.print(current.data +" -> ");
                current = current.next;
            }
            System.out.println("Null");
        }
    }





