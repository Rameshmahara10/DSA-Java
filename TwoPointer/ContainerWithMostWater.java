// Problem: Container With Most Water
// LeetCode: 11
// Difficulty: Medium
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width * h);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
