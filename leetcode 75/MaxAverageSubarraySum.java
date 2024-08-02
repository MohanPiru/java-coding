/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/


class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        // This is the initial sum of the first window
        double currentSum = maxSum;

        // Slide the window from the start to the end of the array
        for (int i = k; i < nums.length; i++) {
            // Update the sum to reflect the new window position
            currentSum += nums[i] - nums[i - k];
            // Update the maxSum if the current window's sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        // The maximum average is the max sum divided by k
        return maxSum / k;
    }
}