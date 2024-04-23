public class Main {
    
    public static void main(String[] args) {
        String s = ")))(())";
        int balance=0,addition=0;
      for (char c:s.toCharArray()){
          if(c=='('){
              balance++;
          }else
          {
              if(balance==0)
              addition++;
              else
              balance--;
          }
      }
      addition+=balance;
      System.out.println(addition);
    }
}