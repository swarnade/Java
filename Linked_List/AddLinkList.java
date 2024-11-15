package Linked_List;

public class AddLinkList {
    Node head;
    class Node
    {   
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void Addfirst(String data)
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
    public void AddLast(String data)
    {
        Node newNode=new Node (data);
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

    public void PrintData()
    {
        if(head==null)
        {
            System.out.println("No List Exist");
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    
    }
    public void RemoveLast()
    {
        if(head==null)
        {
            System.out.println("List Does Not Exist");
        }
        Node currNode=head;
        Node Last=head.next;
        while(Last.next!=null)
        {
            Last=Last.next;
            currNode=currNode.next;

        }
        currNode.next=null;
    }
    public void RemoveFirst()
    {
        if(head==null)
        {
            System.out.println("No List Exists");
        }
        Node currNode=head;
        head=currNode.next;
    }
    public static void main(String[] args) {
        AddLinkList arr =new AddLinkList();
        arr.Addfirst("Hello");
        arr.AddLast("Hellod");
        arr.Addfirst("Hello");
        arr.AddLast("Helloa");
        arr.Addfirst("Hellob");
        arr.PrintData();
        arr.RemoveFirst();
        System.out.println();
        arr.PrintData();
        arr.RemoveLast();
        System.out.println();
        arr.PrintData();

    }
}