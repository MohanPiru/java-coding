//input str="1 2 3 . , # 1 # 2 # 3";
//output   s= ABC.,123


// to check for string use s.equals() in if-else
public class Main
{
	public static void main(String[] args) {
	    String str="1 2 3 . , # 1 # 2 # 3";
	    String[] s=str.split("\\s+");
	    StringBuilder sb=new StringBuilder();
	    
	    for(int i=0;i<s.length; i++){
	       if(isNum(s[i]))
	       sb.append((char)(Integer.parseInt(s[i])+64));
	       
	       else if(s[i].equals("#")){
	           sb.append(s[i+1]);
	           i++;
	       }
	       
	       else if(s[i].equals("_"))
	       sb.append(" ");
	       else
	        sb.append(s[i]);
	        
	        
	    }     
	        
	   System.out.println(sb);
	   
	   
	   
	   
	}
	
	
	
	
	public static boolean isNum(String s){
	    try{
	        Integer.parseInt(s);
	        return true;
	    }
	    catch(Exception e){
	    return false;
	    }
	}
}


// intersection and union of array 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr1={2,4,5,6,8};
		int[] arr2={1,4,5,9,3};
		
		HashMap<Integer,Integer> h =new HashMap<Integer , Integer>();
		
		for(int i=0;i<arr1.length;i++){
		    if(h.containsKey(arr1[i]))
		    h.replace(arr1[i], h.get(arr1[i])+1);
		    else
		    h.put(arr1[i],1);
		}
		for(int j=0;j<arr2.length;j++){
		    if(h.containsKey(arr2[j]))
		    h.replace(arr2[j], h.get(arr2[j])+1);
		    else
		    h.put(arr2[j],1);
		}
		
		
		for(Map.Entry<Integer, Integer> m : h.entrySet()){   

         // System.out.println(m.getKey()+" "+m.getValue());    
          
          if(m.getValue() > 1)
          System.out.print(m.getKey()+" ");
          
   } 
		
	}
}



// max binary subarray first 0 always before 1
//input int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 1};
//output = { 0,0,1,1}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 1};
		 int maxLength = 0;
        int maxStart = 0;
        
        int currentStart = 0;
        int currentZeros = 0;
        int currentOnes = 0;
        boolean foundOne = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (foundOne) {
                    // We found a new start point
                    currentStart = i;
                    currentZeros = 1;
                    currentOnes = 0;
                    foundOne = false;
                } else {
                    currentZeros++;
                }
            } else if (arr[i] == 1) {
                currentOnes++;
                foundOne = true;
            }

            if (foundOne && currentZeros + currentOnes > maxLength) {
                maxLength = currentZeros + currentOnes;
                maxStart = currentStart;
            }
        }

        int[] result = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            result[i] = arr[maxStart + i];
            System.out.println(result[i]);
        }
		
	}
}


// 4 power of a contains the number in the last 
// like 4rth power of 5 =625; 625 has 5 at last 

public class Main
{
	public static void main(String[] args) {
		
		int n=25;
		int len=String.valueOf(n).length();
		int po4=(int)Math.pow(n,4);
		
		System.out.println(isSame(po4,n,len));
// 	String str=String.valueOf(po4);
// 	str=str.substring(str.length()-len,str.length());
	
// 	if(str.equals(String.valueOf(n)))
// 	System.out.println(true);
//     else
//     System.out.println(false);
	
	}
	
	public static boolean isSame(int temp,int temp2,int len){
	    for(int i=0;i<len;i++){
		    if(temp%10!=temp2%10)
		    return false;
		   
		   temp=temp/10;
		   temp2=temp2/10;
		    
		}
		return true;
	}
}

