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
