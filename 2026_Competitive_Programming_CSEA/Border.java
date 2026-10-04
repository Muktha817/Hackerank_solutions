import java.util.*;

public class Border {
    public static void main(String[] args) {
        String s = "abcab";
        int n = s.length();

        for (int len = 1; len < n; len++) {
            if (s.substring(0, len).equals(s.substring(n - len))) {
                System.out.println(s.substring(0, len));
            }
        }
    }
}