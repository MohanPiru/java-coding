import java.util.*;
 
class ReplaceArrayWithRank {
 
    static void changeArr(int[] input)
    {
        // Copy input array into newArray
        int newArray[] = Arrays.copyOfRange(input, 0, input.length);
 
        // Sort newArray[] in ascending order
        Arrays.sort(newArray);
        for(int i=0; i< input.length; i++){
    
        for(int j=0; j< input.length; j++){
            if(newArray[j]==input[i])
            {
                input[i] = j+1;
                break;
            }
        }
    }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Given array arr[]
        int[] arr = { 100, 2, 70, 12 , 90};
 
        // Function Call
        changeArr(arr);
 
        // Print the array elements
        System.out.println(Arrays.toString(arr));
    }
}