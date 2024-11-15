package Pattern;

/**
 * RightAngleTriangle
 */
public class RightAngleTriangle {

    public static void main(String[] args) {
        int inp=Integer.parseInt(args[0]);
        for(int i=1;i<=inp;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}