class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        int[] arr = nums.clone();
        int count = 0;
        while (true) {
            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                return count;
            }
            int minSum = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < n - 1; i++) {
                int sum = arr[i] + arr[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }
            arr[index] = minSum;
            for (int i = index + 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            count++;
        }
    }
}