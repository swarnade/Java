public class OddEven {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        if(num%2==0)
        {
            System.out.println(num+" Is Even");
        }
        else
        {
            System.out.println(num+" Is Odd");
        }
    }
}
