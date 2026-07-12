public class MaximumSubArraySum {
    public static void MaximumSubArraySum(int[] arr) {
        long maxSoFar = Long.MIN_VALUE; 
        long currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSoFar);
    }
}