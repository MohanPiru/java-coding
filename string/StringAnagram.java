import java.util.Scanner;
import java.util.Arrays;


public class StringAnagram
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1 = sc.nextLine();
       	System.out.println("Enter the second string : ");
       	String str2 = sc.nextLine();
       	
       	str1=str1.toLowerCase();
       	str2=str2.toLowerCase();
       	
       	if (str1.length()==str2.length()){
       	  char[] chararray1 = str1.toCharArray();
       	  char[] chararray2 = str2.toCharArray();
       	  
       	  Arrays.sort(chararray1);
       	  Arrays.sort(chararray2);
       	  boolean result = Arrays.equals(chararray1, chararray2);
       	  
       	  if(result){
       	      System.out.println("It is  Anagram ");
       	  }
       	  else
       	  System.out.println("not Anagram ");
       	} 
       	else{
       	    System.out.println("not Anagram ");
       	}
	
	}
}