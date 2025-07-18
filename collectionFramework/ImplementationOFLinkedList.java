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

class Node {
    int data ;
    Node next ;

    Node(int data ){
        this.data = data;
        this.next= null;

    }
}

class MyLinkedList{

    Node head ;

    public void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next!=null){

           current= current.next;

        }
    current.next=newNode;

    }


    public void Print(){

        Node current = head;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;

        }


    }
}