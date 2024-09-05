import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str="RRRRRR";
		int minute=0;
		int k=6;
		
		HashMap<Integer,Boolean> h=new HashMap<>();
		
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='R')
		    h.put(i,false);
		    else
		    h.put(i,true);
		}
		
		for(int i=0;i<str.length();i++){
		    if(h.get(i)==false){
		        int j=i;
		        
		        while(j<k+i && j<str.length()) {
		            if(h.get(j)==false)
		            h.replace(j,true);
		            else
		            h.replace(j,false);
		            
		            j++;
		        }
		        
		        minute++;
		        
		        }
		    }
		System.out.println(minute);
		
	}
}