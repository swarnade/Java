package Linked_List;
import java.util.LinkedList;

public class CollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> str= new LinkedList<String>();

        str.addFirst("A");
        str.addFirst("B");
        str.addFirst("C");
        str.addFirst("D");
        str.addFirst("E");
        str.addFirst("F");
        System.out.println(str);
        System.out.println(str.get(0));
        System.out.println(str.size());

        for(int i=str.size()-1;i>=0;i--)
        {
            System.out.println(str.get(i));
        }
    }
}
