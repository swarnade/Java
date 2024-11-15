package Array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr={45,89,45,56,45};
        System.out.println(Arrays.toString(arr));
        int largest=arr[0];
        int SecondLargest =-1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest)
            {   SecondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>SecondLargest){
                SecondLargest=arr[i];

            }
        }
    System.out.println(largest);
    System.out.println(SecondLargest);
    }
}
