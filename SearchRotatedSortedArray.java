public class Main {
    public static int sort(int[] arr,int len, int k) {
        int high=len-1;
        int low=0,mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==k)
            return mid;
            //left sorted
            if(arr[low]<=arr[mid]){
                if(arr[low]<=k && k<=arr[mid])
                  high=mid-1;
                else
                  low=mid+1;
            }
            //right sorted
            else{
                if(arr[mid]<=k && k<=arr[high])
                low=mid+1;
                else
                high=mid-1;
                
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 7,8,9,1,3,6};
        int target=2;
        int n=sort(nums,nums.length,target);
        
        if(n>=0){
          System.out.println("target found at index : "  +n);  
        }
        else
         System.out.println("target not found ");  
       
      
    }
}
