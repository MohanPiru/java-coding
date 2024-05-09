public class Main {
    public static void main(String[] args) {
    Stack stk =new Stack();

     stk.push(16);
     stk.push(17);
     stk.push(18);
    stk.print();
    int val=stk.pop();
    
    
    
  
    System.out.println("\n"+stk.empty());
    System.out.println(val);
    System.out.println(stk.pop());
    System.out.println(stk.pop());
    stk.print();
    }
}

  class Stack{
    int MAX=10;
    int top=-1;
    int[] stack=new int[MAX];
    
    void push(int val){
        if(top==MAX-1)
        System.out.println("Stack overflow");
        else{
            top=top+1;
            stack[top]=val;
        }
    }
    
    int pop(){
        if(top==-1){
        System.out.println("Stack is empty");
        return -999;
        }
        else{
            int temp= stack[top];
            top=top-1;
            return temp;
        }
    }
    
    boolean empty(){
    if(top==-1)
    return true;
    else
    return false;
    }
    
    void print(){
        if(!empty()){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
     }
     else
     System.out.print("it is empty");
    }
    
}
