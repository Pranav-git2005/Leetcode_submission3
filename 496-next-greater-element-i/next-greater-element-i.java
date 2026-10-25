class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        int[] stack = new int[n2];
        int top = -1;
        int[] next = new int[10001];
        java.util.Arrays.fill(next, -1);
        for (int i = 0; i < n2; i++) {
            int num = nums2[i];
            while (top >= 0 && stack[top] < num) {
                next[stack[top--]] = num;
            }
            stack[++top] = num;
        }
        int n1 = nums1.length;
        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            ans[i] = next[nums1[i]];
        }
        return ans;
    }
}