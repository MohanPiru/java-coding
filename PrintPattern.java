/*
1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4
*/

public class Main
{
	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++){
		    for(int j=i;j<=i+4;j++){
		        System.out.print(j%5+1+" ");
		    }
		    System.out.println();
		}
	}
}