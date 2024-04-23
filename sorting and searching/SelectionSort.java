import java.util.Scanner;

public class SelectionSort
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
		    int small=i;
		    for(int j=i+1;j<size;j++){
		        if(arr[small]>arr[j]){
		            small=j;
		        }
		    }
		    
		    int temp=arr[i];
		    arr[i]=arr[small];
		    arr[small]=temp;
		}
		
		
		System.out.println("after sorting ........");
		
		for(int num : arr){
		    System.out.print(num +" ");
		}
	}
	
}