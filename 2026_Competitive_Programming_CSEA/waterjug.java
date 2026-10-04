import java.util.*;

public class waterjug {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    static int pour(int from, int to, int target) {
        int fromCap = from;
        int toCap = to;

        int fromAmount = fromCap;
        int toAmount = 0;
        int steps = 1;

        while (fromAmount != target && toAmount != target) {
            int transfer = Math.min(fromAmount, toCap - toAmount);

            toAmount += transfer;
            fromAmount -= transfer;
            steps++;

            if (fromAmount == target || toAmount == target)
                break;

            if (fromAmount == 0) {
                fromAmount = fromCap;
                steps++;
            }

            if (toAmount == toCap) {
                toAmount = 0;
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int target = sc.nextInt();

        if (target > Math.max(a, b) || target % gcd(a, b) != 0) {
            System.out.println(-1);
        } else {
            System.out.println(Math.min(
                pour(a, b, target),
                pour(b, a, target)
            ));
        }
    }
}