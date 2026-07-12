import java.io.*;
import java.util.*;
public class maximumascsum {
    public static int maxAscendingSum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentSum += arr[i]; 

            } else 
                currentSum = arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxAscendingSum(arr));

    }
}