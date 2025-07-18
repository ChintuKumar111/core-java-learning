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
      Nodde next;
      int data;
      Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    class MyList {
        Nodde head;
        public void add(int data) {
            Nodde newNode = new Nodde(data);
            if(head==null) {
                head=newNode;
                return;
            }
            Nodde current = head;
            while(current.next!=null) {
                current = current.next;
            }
            current.next= newNode;
        }
       public void addFirst(int data)
        {
            Nodde headNode  = new Nodde(data);
            if(head ==null)
            {
                head=headNode;
                return;
            }
            Nodde current = head;
            headNode.next=head;
            head= headNode;        }
        public void PrintValue() {
            Nodde current = head;
            if(head == null) {System.out.println("List is empty");}
            while(current!=null) {
                System.out.print(current.data +" -> ");
                current = current.next;
            }
            System.out.println("Null");
        }
    }





