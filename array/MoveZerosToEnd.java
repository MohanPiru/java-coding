// public class Main
// {
// 	public static void main(String[] args) {
// 		int[] arr={0,0,2,4,0,0,5,0,1,0,9};
		
// 		int empty=0;
// 		int full=0;
// 		int i=0;
// 		int j=arr.length-1;
// 		while(i<=j){
// 		    if(arr[j]==0)
// 		    j--;
// 		    if(arr[i]>0)
// 		    i++;
// 		    if(i<j && arr[i]==0 && arr[j]>0){
// 		    int temp=arr[i];
// 		    arr[i]=arr[j];
// 		    arr[j]=temp;
// 		    i++;
// 		    j--;
// 		    }
// 		}
// 		for(int a:arr)
// 		System.out.print(a+" ");
		
// 	}
// }
`
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

