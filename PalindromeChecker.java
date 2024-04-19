
//with command line arguments
public class PalindromeChecker {
    public static void main(String[] args) {
        
         if(isNumeric(args[0])){
             pal(Integer.parseInt(args[0]));
         }else{
             pal(args[0]);
         }
 }
 public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}    

 public static void pal(String str){
     String original, reverse = "";
     original = str;   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
 }
 
    public static void pal(int n){
         int r,sum=0,temp;    
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
    }
}

