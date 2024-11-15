package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        list.set(0, 0);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        list.add(1,2);

        System.out.println(list);

        for (int i = 0; i < 18; i++) {
            System.out.println(list.get(i));
        }
    }
}
