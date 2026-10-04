import java.util.*;

public class Tugofwar {
    static int n;
    static int[] a;
    static int total;
    static int ans = Integer.MAX_VALUE;

    static void solve(int index, int count, int sum) {
        if (count == n / 2) {
            ans = Math.min(ans, Math.abs(total - 2 * sum));
            return;
        }

        if (index == n)
            return;

        if (n - index < n / 2 - count)
            return;

        solve(index + 1, count + 1, sum + a[index]);
        solve(index + 1, count, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }

        solve(0, 0, 0);

        System.out.println(ans);
    }
}