import java.util.*;

public class Extended {
    static int x, y;

    static int gcd(int a, int b) {
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        }

        int g = gcd(b, a % b);

        int temp = x;
        x = y;
        y = temp - (a / b) * y;

        return g;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int g = gcd(a, b);

        System.out.println(g);
        System.out.println(x + " " + y);
    }
}