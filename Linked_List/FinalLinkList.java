package Linked_List;

public class FinalLinkList {
    Node head;
    
    //Structure Of Node
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add At First Position
    public void AddFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add At Last Position
    public void AddLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // Remove First Element
    public void RemoveFirst() {
        if (head == null) {
            System.out.println("No List Exists");
        }
        head = head.next;
    }

    // Remove Last Element
    public void RemoveLast() {
        if (head == null) {
            System.out.println("No List Exists");
            return;
        }

        if (head.next == null) {
            head.next = null;
            return;
        }

        Node secondLastNode = head;
        Node LastNode = head.next;

        while (LastNode.next != null) {
            LastNode = LastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

    }

    // Traversing The List
    public void Print() {
        if (head == null) {
            System.out.println("No List Exists");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
    public void Reverse()
    {
        Node prev=head;
        Node curr=head.next;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    // Main Function
    public static void main(String[] args) {
        FinalLinkList fll = new FinalLinkList();
        fll.AddFirst("1");
        // fll.AddFirst("2");
        // fll.AddFirst("3");
        // fll.AddFirst("4");
        // fll.AddFirst("5");
        // fll.AddFirst("6");
        fll.AddLast("2");
        fll.AddLast("3");
        fll.AddLast("4");
        fll.AddLast("5");
        fll.AddLast("6");
        // fll.RemoveFirst();
        fll.Reverse();
        fll.Print();
    }
}
