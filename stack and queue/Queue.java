class Queue{
    static int MAX=10;
    static int rear=-1,front=-1;
    static int[] queue;
    
    Queue(){
        queue = new int[MAX];
        
    }
    
     void add(int data){
        if(rear==MAX-1){
           System.out.println("Queue is full "); 
        } 
        else{
            if(front==-1){
            front=0;}
            
            rear++;
            queue[rear]=data;
            
        }
    }
    
      int remove(){
        if(front > rear || front == -1){
            System.out.println("Queue is empty ");
            return -1;
            
        }
        else{
            int val = queue[front];
            front++;
            return val;
        }
    }
    
     boolean isEmpty(){
        if(front > rear || front == -1){
            return true;
        }
        return false;
    }
    
     int peek(){
         if(isEmpty()){
           System.out.println("Queue is empty ");  
           return -1;
         }
         else
         return queue[front];
     }
     
    public void print(){
         if(isEmpty()){
           System.out.println("Queue is empty ");  
         }
         else{
         for (int i=front;i<=rear;i++)
         System.out.print(queue[i]+ " ");
         }
     }
}

public class Main
{
	public static void main(String[] args) {
		Queue q =new Queue();
		q.add(1);
		q.add(3);
		int a = q.remove();
		System.out.println(a);
		System.out.println(q.peek());
		q.print();
	}
}


//collections
/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Queue<Integer> q=new LinkedList<>();
	    
	   q.add(1);
	   q.add(2);
	   q.add(3);
	   q.remove();
       int a =q.peek();
	   
	    
	    System.out.println(a);
		System.out.println(q);
	}
}

*/

