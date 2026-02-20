// Problem: Sum of All Odd Length Subarrays
// Difficulty: Easy
// Approach: Contribution Technique
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int totalSubarrays = (i + 1) * (n - i);
            int oddCount = (totalSubarrays + 1) / 2;
            sum += arr[i] * oddCount;
        }

        return sum;
    }
}
