import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int maxSubArraySum(int[] arr) {	
    int size = arr.length;	
    int start = 0;	
    int end = 0;	
    int maxSoFar = arr[0], maxEndingHere = arr[0];	
    for (int i = 1; i < size; i++) {	
        maxEndingHere = maxEndingHere + arr[i];	
        if (arr[i] > maxEndingHere) {	
            maxEndingHere = arr[i];	
            if (maxSoFar < maxEndingHere) {	
                start = i;	
            }	
        }	
        if (maxSoFar < maxEndingHere) {	
            maxSoFar = maxEndingHere;	
            end = i;	
        }	
    }
     System.out.println("Found Maximum Subarray between index " +Math.min(start, end)+ " and "+ end);
  
    return maxSoFar;	
}

    public static void main(String[] args) {
        int[] A = {-1, 3,3, -4};
      
        
        int n= maxSubArraySum(A);
        System.out.println("Maximum Subarray sum is : " +n);
    }
}
// or 



public class Main
{
	public static void main(String[] args) {
	    int[] nums = {-2, 1,4,-6,2};
	 int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        
        System.out.println("max subarray sum index start="+start+" end="+end+" maxsum="+maxSum);
	}
}




//count of subarray whose sum equals to given input.....

public class Main
{
	public static void main(String[] args) {
		
		int arr[]={1};
		int start=0;
		int end;
		int sum=0;
		int match=12;
		int count=0;
		
		for(end=0;end<arr.length;end++){
		    sum=sum+arr[end];
		    
		    
		    while(sum>match && start<=end){
		        sum=sum-arr[start];
		        start++;
		    }
		    
		    if(sum==match)
		    count++;
		    
		    
		}
		
		System.out.println(count);
	}
}
