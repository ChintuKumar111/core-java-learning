package collectionFramework;

public class LinkedListDeleteOperation {
    public static void main(String[] args) {

        LLDeleteOperation list = new LLDeleteOperation();
        list.addLast(1);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);

        list.Print();
        list.deleteFirst();
        list.lastDelete();
        list.Print();
        list.addFirst(6);
        list.Print();

    }
}


class Node1 {
    int data ;
    Node1 next ;

    Node1(int data ){
        this.data = data;
        this.next= null;

    }
}

class LLDeleteOperation{

    Node1 head ;

    public void addFirst(int data){
        Node1 newNode = new Node1(data);
        if(head ==null){
            head= newNode;
        }
newNode.next = head;
        head = newNode;


        }


    public void addLast(int data){
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


    // delete the first node

    public void deleteFirst(){

        if(head==null){
            System.out.println("List is empty");
        }

        head = head.next;

    }

    // delete last element in linked list

    public void lastDelete(){
        if(head ==null){
            System.out.println("List is empty ");
        }

        Node1 lastNode = head.next;

        Node1 secondLastNode = head;

        while(lastNode.next!=null){

            lastNode =lastNode.next;
            secondLastNode = secondLastNode.next;



        }
        secondLastNode.next=null;


    }


}