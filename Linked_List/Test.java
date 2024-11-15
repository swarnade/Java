package Linked_List;

public class Test {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void AddFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void PrintData()
    {
        if(head==null)
        {
            System.out.println("No List Found");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }








    public void AddLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }















    public static void main(String[] args) {
        Test dat=new Test();
        dat.AddFirst("Last");
        dat.AddFirst("Hello");
        dat.AddFirst("Hello");
        dat.AddFirst("Hello");
        dat.AddFirst("Hello");
        dat.AddFirst("Hello");
        dat.PrintData();
    }
}
