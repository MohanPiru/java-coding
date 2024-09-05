//put all elements in a hashset then check element and its consequtives are contains or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<>();
		int[] num = {100, 1, 200, 4, 3, 2,5};
		
		for(int i=0;i<num.length;i++)
		s.add(num[i]);
		
		int streak=0;
		int current =0;
		int max=0;
		for(int n:s){
		    if(!s.contains(n-1)){
		        current=n;
		        streak=1;
		        while(s.contains(current+1)){
		        current+=1;
		        streak+=1;}
		    }
		    if(streak>max)
		    max=streak;
		    
		}
		
		System.out.println(max);
	}
}

//output: 5