import java.io.*;
import java.util.*;
public class interchangingOfNumbersInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < size; i++) {

            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
