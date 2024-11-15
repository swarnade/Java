package Linked_List;

public class ListNodePractice {

    Node head;

    class Node {

        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(String data)
    {   
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return ;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void RemoveFirst()
    {
        if(head.next==null)
        {
            head=null;
            return;
        }
        head=head.next;

    }

    public void RemoveLast() {
        Node SecondLast = head;
        Node Last =head.next;
        if (Last.next != null) {
            SecondLast=SecondLast.next;
            Last=Last.next;
        }
        SecondLast.next=null;
    }


    public void PrintList() {
        if (head == null) {
            System.out.println("No List Exist");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        ListNodePractice curr = new ListNodePractice();
        curr.addFirst("4");
        curr.addFirst("3");
        curr.addFirst("2");
        curr.addFirst("1");
        curr.PrintList();
        System.out.println("");
        curr.AddLast("3");
        curr.AddLast("2");
        curr.AddLast("1");
        curr.PrintList();
    }
}
