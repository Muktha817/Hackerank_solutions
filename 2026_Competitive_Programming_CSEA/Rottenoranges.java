import java.util.*;

public class Rottenoranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();

                if (grid[i][j] == 2)
                    q.add(new int[]{i, j});
            }
        }

        int time = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int size = q.size();
            boolean changed = false;

            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();

                for (int d = 0; d < 4; d++) {
                    int r = cur[0] + dr[d];
                    int c = cur[1] + dc[d];

                    if (r >= 0 && r < n && c >= 0 && c < m &&
                        grid[r][c] == 1) {

                        grid[r][c] = 2;
                        q.add(new int[]{r, c});
                        changed = true;
                    }
                }
            }

            if (changed)
                time++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(time);
    }
}