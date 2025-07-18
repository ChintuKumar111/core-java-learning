package collectionFramework;

public class ImplementationOFLinkedList {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);

        list.Print();


    }
}

  class Nodde {
    int data ;
    Node1 next ;

    Nodde(int data ){
        this.data = data;
        this.next= null;

    }
}

class MyLinkedList{

    Node1 head ;

    public void add(int data){
        Node1 newNode = new Node1(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node1 current = head;

        while(current.next!=null){

           current= current.next;

        }
    current.next=newNode;

    }


    public void Print(){

        Node1 current = head;

        while(current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;

        }
        System.out.println("null");  // End of list
    }
}