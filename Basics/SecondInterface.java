package Basics;

import org.w3c.dom.ls.LSOutput;

public class SecondInterface {
    public static void main(String[] args) {

        Records record = new Records();

        record.MessItems();
        record.NumberOfWindow();
        record.NumberOFBEd();
        record.StudentDetails();



    }
}

interface HostelManagement{

    void StudentDetails();
    void MessItems();


}

interface Rooms extends HostelManagement{

    void NumberOFBEd();
    void NumberOfWindow();

}

class Records implements Rooms
{
    public void NumberOFBEd(){
        System.out.println("there are n number of beds presenet in the room");
    }



    public void NumberOfWindow(){
        System.out.println("there are 3 window in each room ");
    }

    public void StudentDetails(){
        System.out.println("There are total n number of student present");
    }


    public void MessItems(){
        System.out.println("vegetabels,rice ,water ,cattering ,stand ,paneer ");
    }
}