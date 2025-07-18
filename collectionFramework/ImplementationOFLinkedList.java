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
    Nodde next ;

    Nodde(int data ){
        this.data = data;
        this.next= null;

    }
}

class MyLinkedList{

    Nodde head ;

    public void add(int data){
        Nodde newNode = new Nodde(data);

        if(head==null){
            head = newNode;
            return;
        }

        Nodde current = head;

        while(current.next!=null){

           current= current.next;

        }
    current.next=newNode;

    }


    public void Print(){

        Nodde current = head;

        while(current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;

        }
        System.out.println("null");  // End of list
    }
}