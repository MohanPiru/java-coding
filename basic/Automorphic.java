import java.util.Scanner;
public class Automorphic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);    
		System.out.print("Enter a binary number : ");
		int num=sc.nextInt();
		String s1 = Integer.toString(num);
		int sq=num*num;
		String s2 = Integer.toString(sq);
		String s3 = s2.substring(s2.length() - s1.length());
		
		if(s1.equals(s3))
			System.out.println("Automorphic Number");
		else
			System.out.println("Not an Automorphic Number");
		//closing scanner class(not compulsory, but good practice)
		sc.close();
	
	}
}