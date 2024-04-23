
import java.util.Stack ;

public class PostEval {
    public static void main(String args[]) {
     Stack<Integer> st = new Stack<>();
     for(int i=0;i<args[0].length(); i++){
         char ch = args[0].charAt(i);
         if(Character.isDigit(ch)){
             st.push(ch-'0');
         }
         else{
             int a=st.pop();
             int b=st.pop();
             switch(ch){
                 case '+':
                     st.push(b+a);
                     break;
                case '-':
                     st.push(b-a);
                     break;
                case '*':
                     st.push(b*a);
                     break;
                case '/':
                     st.push(b/a);
                     break;
                     
                       }
            }
         }
         int c=st.pop();
         System.out.println("after evaluation  " + c);
    }
}