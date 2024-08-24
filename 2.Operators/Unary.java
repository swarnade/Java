public class Unary {
    public static void main(String[] args) {
        int y = 5;
        int a = y++;
        int b = y;
        System.out.println(a);
        System.out.println(b);

        System.out.println("");

        int z = 5;
        int c = ++z;
        int d = z;
        System.out.println(c);
        System.out.println(d);
    }
}
