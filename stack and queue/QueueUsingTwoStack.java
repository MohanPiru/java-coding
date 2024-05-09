import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		
		Queue q=new Queue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		int val = q.remove();
		q.add(4);
		q.remove();
		System.out.println(val);
		q.print();
	}
	
  
}
class Queue{
   static Stack<Integer> st1;
   static  Stack<Integer> st2;
    Queue(){
        st1 =new Stack<>();
	    st2=new Stack<>();
    }
    
    
    static	void add(int data){
      st1.push(data);
	}
	
	
	static int remove(){
	    while(!st1.isEmpty())
	    st2.push(st1.pop());
	    
	    int val=st2.pop();
	    
	    while(!st2.isEmpty())
	        st1.push(st2.pop());
	    
	    return val;
	}
	static void print(){
	    System.out.println(st1);
	}
}
