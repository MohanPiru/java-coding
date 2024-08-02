import java.util.*;     

public class Main
{
	public static void main(String[] args) {
	
		
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();//Creating HashMap    
   int arr[] ={2,2,2,3,1,6,6,5,5,5,5,};
   for(int i=0;i<arr.length;i++){
       if(map.containsKey(arr[i]))
       map.replace(arr[i],map.get(arr[i])+1);
      else
      map.put(arr[i],1);
   }
   int max=0;
   int val=0;
   for(Map.Entry<Integer, Integer> m : map.entrySet()){   
       if(m.getValue() > max){
       max=m.getValue();
       val=m.getKey();}
   // System.out.println(m.getKey()+" "+m.getValue());    
   } 
   System.out.println(max); //max frequency among the array elements
   System.out.println(val); // the element is val
   
	}
}