import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		int n1=11;
		int n2=15;
		int count=0;
		for(int i=n1;i<=n2;i++){
		    if(isRepeat(i))
		    count++;
		    
		 
		}
		System.out.println(count);

		
		
	}
	public static boolean isRepeat(int n){
	    HashMap<Integer,Integer> h=new HashMap<Integer, Integer>();
	    
	    while(n!=0){
	        
	    if(h.containsKey(n%10))
	    return false;
	    else{
	        h.put(n%10,1);
	    }
	    n=n/10;
	    
	    }
	    return true;
	}
}