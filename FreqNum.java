import java.util.*;

public class FreqNum
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		
	
	
	int arr[]={10,20,30,10,20,90,10};
	for(int i=0;i<arr.length;i++){
	    
	    int x=arr[i];
	    int count=0;
	    if(x!=-1){
	    for(int j=0;j<arr.length;j++){
	        
	        if(x==arr[j]){
	            count++;
	            arr[j]=-1; //not for checking the visited element before
	        }
	    }
	    System.out.println("frequency of  " + x + " is : "+ count);
	    }
	}
		
	}
	
}
