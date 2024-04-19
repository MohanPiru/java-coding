import java.util.*;

public class SecondLargestElement
{
static void print2largest(Integer arr[], int arr_size)
    {
   
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 1; i < arr_size; i++) {

            if (arr[i] != arr[0]) {
                System.out.printf("The second largest "
                                      + "element is %d\n",
                                  arr[i]);
              return ; 
            }
             
            
        }
        

        System.out.printf(" -1 ");
    }

    // Driver code
    public static void main(String[] args)
    {
        Integer arr[] = { 34, 34, 34, 34 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
