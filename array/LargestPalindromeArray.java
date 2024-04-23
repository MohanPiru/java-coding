import java.util.*;
public class LargestPalindromeArray
{
	public static void main(String[] args) {
		
		int[] arr ={100,111,1235321,234,432234};
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>0;i--){
		    if(pal(arr[i])>0){
		        System.out.print("The largest pallindrome is : "+arr[i]);
		        break;
		    }
		}
		
	}
   public static int pal(int n){
         int r,sum=0,temp;    
         temp=n;    
        while(n>0){    
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;    
         }    
      if(temp==sum)    
      return temp; 
      else
      return -1;
   }
   
}
