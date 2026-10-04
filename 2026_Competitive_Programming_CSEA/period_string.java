
public class period_string{
    public static void main(String[] args) {
        String s = "ababab";
        int n = s.length();

        for (int p = 1; p <= n; p++) {
            boolean ok = true;

            for (int i = p; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - p)) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                System.out.println(p);
                break;
            }
        }
    }
}