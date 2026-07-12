import java.io.*;
import java.util.*;
public class merginingTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int i = 0, j = 0, k = 0;
        int[] result = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            result[k++] = arr1[i++];
        }

        while (j < m) {
            result[k++] = arr2[j++];
        }

        for (i = 0; i < n + m; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
