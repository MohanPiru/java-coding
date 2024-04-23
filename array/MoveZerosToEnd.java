// public class Main {
//     public static void moveZeroes(int[] nums) {
//         int nonZeroIndex = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 if (i != nonZeroIndex) { // Swap only if nonZeroIndex is different from current index
//                     int temp = nums[i];
//                     nums[i] = nums[nonZeroIndex];
//                     nums[nonZeroIndex] = temp;
//                 }
//                 nonZeroIndex++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {0, 1, -2, 3, 4, 0, 5, -27, 9, 0};
//         moveZeroes(nums);
//         System.out.print("Modified array: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }

// good approach
public class Main
{
	public static void main(String[] args) {
		
		int[] nums={1,3,0,4,0,5,0,6};
		int size = nums.length;

        int j = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        
        for (int i:nums){
            System.out.print(i+ " ");
        }
        
	}
}

