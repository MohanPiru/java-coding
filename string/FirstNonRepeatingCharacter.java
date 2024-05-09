public class Main
{
	public static void main(String[] args) {
		String s="aaBccD";

	for(int i=0;i<s.length();i++){
	         boolean count=true;
		    for(int j=0;j<s.length();j++){
		    if(i!=j && s.charAt(i)==s.charAt(j)){
		     count=false;
		     break;
		    }
		    }
		  if(count){  
		  System.out.println(s.charAt(i));
		  break;}
		}
		
	}
	
}

//using map

/*
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		String s="aaBccD";
	Map<Character,Integer> map=new HashMap();
	
	for(int i=0;i<s.length();i++){
	         
		char ch=s.charAt(i);
		if(map.containsKey(ch))
		map.put(ch,map.get(ch)+1);
		else
		map.put(ch,1);
		
	}
	System.out.println(map);
	for(Map.Entry<Character, Integer> en : map.entrySet()){
	    if(en.getValue()==1){ 
	        System.out.println(en.getKey());
	        break;
	    }
	}
	}
	
}
*/
