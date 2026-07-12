import java.io.*;
import java.util.*;
public class FactorialRecursion{
    public static int fact(int n) {
        if (n == 1)
            return 1;

        else {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(fact(num));
    }
}