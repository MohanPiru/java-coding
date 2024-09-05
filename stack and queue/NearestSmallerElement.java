import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={3,2,1};
	    int[] res=new int[arr.length];
	    
	    Stack<Integer> st=new Stack<>();
	    st.push(arr[0]);
	    res[0]=-1;
	    for(int i=1;i<arr.length;i++){
	        
	        while(!st.empty() && st.peek()>=arr[i])
	        st.pop();
	        
	        if(!st.empty() && st.peek()<arr[i] ){
	        res[i]=st.peek();
	        st.push(arr[i]);}
	        else
	        res[i]=-1; 
	    }
	        for(int a:res)
		    System.out.print(a+" ");

	}
}