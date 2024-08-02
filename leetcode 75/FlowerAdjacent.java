/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

*/




class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int length = flowerbed.length;

        for (int i = 0; i < length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                // Check if the left and right plots are empty (or boundary conditions)
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Plant a flower here
                    n--; // One less flower to plant
                }
            }
        }

        return n == 0;
    }
}