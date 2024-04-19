import java.util.*;
 
class FreqOfChar {
 
    public static void main(String args[])  {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string :");
        String str=sc.nextLine();
        str=str.toLowerCase();
        
        for(char ch='a';ch<='z';ch++){
            
            int count=0; //counter variable
            
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count!=0)
            System.out.println("Frequency of " +ch+" is :-  "+ count );
            
            
        }
    } 
}

// Frequency of numbers

/*
import java.util.*;
 
class Main {
 
    public static void main(String args[])  {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        //str=str.toLowerCase();
        String str=String.valueOf(n);
        
        for(char a='0';a<='9';a++){
            
            int count=0; //counter variable
            
            for(int i=0;i<str.length();i++){
                if(a==str.charAt(i)){
                    count++;
                }
            }
            if( count!=0)
            System.out.println("Frequency of " +a+" is :-  "+ count );
            
            
        }
    } 
}
*/






// using array ....................






//  public static void main(String[] args) {  
//         String str = "picture perfect";  
//         int[] freq = new int[str.length()];  
//         int i, j;  
          
//         //Converts given string into character array  
//         char string[] = str.toCharArray();  
          
//         for(i = 0; i <str.length(); i++) {  
//             freq[i] = 1;  
//             for(j = i+1; j <str.length(); j++) {  
//                 if(string[i] == string[j]) {  
//                     freq[i]++;  
                      
//                     //Set string[j] to 0 to avoid printing visited character  
//                     string[j] = '0';  
//                 }  
//             }  
//         }  
          
//         //Displays the each character and their corresponding frequency  
//         System.out.println("Characters and their corresponding frequencies");  
//         for(i = 0; i <freq.length; i++) {  
//             if(string[i] != ' ' && string[i] != '0')  
//                 System.out.println(string[i] + "-" + freq[i]);  
//         }  
//     }  