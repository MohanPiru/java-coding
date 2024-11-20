class LL{
    
    private Node head;
    private Node tail;
    
    
    private class Node{
        private int data;
        private Node next;
        
        public Node(int data){
        this.data=data;
          next=null;  
        }
    }
    
    public  void addFirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        
        if(tail==null)
        tail=head;
        
    }
    
    public  void addLast(int data){
        Node newnode=new Node(data);
        if(tail==null){
            addFirst(data);
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    
    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            
            temp=temp.next;
            
        }
        System.out.print("end\n ");
    }
    public void removeFirst(){
        
        head = head.next;
        if(head==null)
        tail=null;
    }
    
    public void removeLast(){
        if(head.next==null){
            removeFirst();
        }else{
            Node temp=head;
            Node secondlast=null;
            while(temp.next!=null){
                secondlast=temp;
                temp=temp.next;
            }
            secondlast.next=null;
            tail=secondlast;
        }
    }
    
    public void insert(int data,int pos){
        Node newnode=new Node(data);
        Node temp=head;
        if(pos==0)
        addFirst(data);
        
        for(int i=1;i<pos;i++){
            temp=temp.next;
            
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    
}

public class Main
{
	public static void main(String[] args) {
     LL l=new LL();
     
     l.addLast(13);
     l.addFirst(12);
     l.addFirst(11);
     l.addFirst(10);
     l.addFirst(9);
     l.addLast(14);
     l.display();
    //  l.removeFirst();
    //  l.removeLast();
    //  l.display();
     l.insert(50,3);
     l.display();
	}
	
}