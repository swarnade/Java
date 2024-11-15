package Array;

import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        int[] roll; // Declaration
        roll = new int[6]; // Initialization
        roll[1] = 0;
        roll[2] = 1;
        roll[3] = 2;
        roll[4] = 3;
        roll[5] = 4;
        for(int i=0;i<6;i++)
        {
            System.out.print(roll[i]+" ");
        }
        System.out.println("null");
        for (int num : roll) { //For Each Loop
            System.out.print(num+" ");
        }
        System.out.println("null");
        System.out.println(Arrays.toString(roll));
        
    }
}
