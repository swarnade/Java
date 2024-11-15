package Linked_List;

public class LL {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // Add

    public void Addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // Add Last
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

    public void printList() {
        if (head == null) {
            System.out.println("List Is Empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }



    public static void main(String[] args) {
        LL list = new LL();
        list.Addfirst("A");
        list.Addfirst("A");
        list.AddLast("B");
        list.Addfirst("A");
        list.Addfirst("A");
        list.printList();
    }
}
