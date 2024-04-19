import java.util.Scanner;

public class BubbleSort
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
		System.out.print("Enter the size of array: ");
		int size= sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++){
		    System.out.println("Enter the "+i+"th value ");
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("Before sorting ........");
		
		for(int num : arr){
		    System.out.print(num +" ");
		}
		
		
		for(int i=0;i<size-1;i++){
		    for(int j=0;j<size-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		
		
		
		
		
		System.out.println("after sorting ........");
		
		for(int num : arr){
		    System.out.print(num +" ");
		}
	}
	
}
