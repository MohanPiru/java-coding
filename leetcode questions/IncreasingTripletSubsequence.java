/*
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
*/

class Solution {
    public boolean increasingTriplet(int[] arr) {
        int i =Integer.MAX_VALUE;
	int j=Integer.MAX_VALUE;
	for(int a=0;a<arr.length;a++){
	    if(arr[a]<=i){
	        i=arr[a];
	        
	    }
	    else if(arr[a]<=j){
	        j=arr[a];
	    }
	    else
	    return true;;
	}
    return false;
    }
}