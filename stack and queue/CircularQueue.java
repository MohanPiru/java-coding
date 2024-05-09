class Queue{
    static int MAX=3;
    static int rear=-1,front=-1;
    static int[] queue;
    
    Queue(){
        queue = new int[MAX];
        
    }
    
     void add(int data){
        if((rear+1)%MAX==front){
           System.out.println("Queue is full "); 
        } 
        else if (front == -1 && rear == -1){
        front = 0;
        rear = 0;
        queue[rear] = data;
            
        }
        else{
            rear = (rear + 1) % MAX;
            queue[rear]=data;
        }
    }
    
    int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return -1;
            
        }
        else if (front == rear)
    {
        int temp= queue[front];
        front = -1;
        rear = -1;
        return temp;
    }

        else{
            int val = queue[front];
            front=(front+1)%MAX;
            return val;
        }
    }
    
     boolean isEmpty(){
        if(rear==-1 && front == -1){
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
         int i=front;
         if(isEmpty()){
           System.out.println("Queue is empty ");  
         }
         else{
            
         while(i!=rear){
         System.out.print(queue[i]+ " ");
         i=(i+1) % MAX;}
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
		q.add(4);
		q.add(5);
		
		int a = q.remove();
		q.remove();
		q.add(5);
		System.out.println(a);
		System.out.println(q.peek());
		q.print();
	}
}
