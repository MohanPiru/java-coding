import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	Stack<Integer> st=new Stack<>();
	int arr[]={2,2,8,6,8};
    int n=arr.length;
    int brr[]=new int[n];
	
	for(int i=(n-1);i>=0;i--){
	    
	    if(st.isEmpty()){
	    st.push(arr[i]);
	    brr[i]=-1;
	    }else{
	    
	    if(arr[i]<st.peek()){
	        brr[i]=st.peek();
	        st.push(arr[i]);
	    }else{
	        while(!st.isEmpty() && st.peek()<=arr[i] )
	        st.pop();
	        
	        if(st.isEmpty())
	        brr[i]=-1;
	        else
	        brr[i]=st.peek();
	        
	        st.push(arr[i]);
	    }
	}
	}
	for(int a:brr)
	System.out.print(a+" ");
	
		
	}
	
  
}


//using array
/*

public class Solution {

    public static int[] nextGreater(int[] arr, int n) {

        int[] ans = new int[n];

        // For every Element
        for (int i = 0; i < n; i++) {
            
            int next = -1;

            // Find its next greater element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }

            ans[i] = next;
        }

        return ans;

    }

}*/