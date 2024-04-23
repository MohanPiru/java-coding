import java.util.*;

public class RotateArray
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of k to rotate : ");
		int k=sc.nextInt();
		int[] arr={2,3,4,5,6,7};
		k=k%arr.length;
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
		
		System.out.println("After rotating ...... ");
		
		for(int i : arr){
		    System.out.print(i + " ");
		}
	}
	
	static void reverse(int[] arr,int start, int end){
	    while(start<end){
	        int temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	}
	
}
