import java.util.*;
import java.lang.Math;

public class Armstrong
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	int length=String.valueOf(num).length();
	int n=num;
	int sum=0;
	int rem=0;
	while(n>0){
	    rem=n%10;
	    sum=sum + (int)(Math.pow(rem, length));
	    n=n/10;
	}
	
	if(sum==num){
	   System.out.print(num +" is an Armstrong number "); 
	}
	else{
	  System.out.print(num +" is not an Armstrong number ");   
	}
		
	}
	
}
