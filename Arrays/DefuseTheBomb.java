// Problem: Defuse the Bomb
// LeetCode: 1652
// Difficulty: Easy
// Approach: Sliding Window + Circular Array
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) return result;

        int sum = 0;
        int start, end;

        if (k > 0) {
            start = 1;
            end = k;
        } else {
            start = n + k;
            end = n - 1;
        }

        // initial window sum
        for (int i = start; i <= end; i++) {
            sum += code[i % n];
        }

        // sliding window
        for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[start % n];
            start++;
            end++;
            sum += code[end % n];
        }

        return result;
    }
}
