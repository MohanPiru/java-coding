package Java;



//with command line arguments
public class Prime1 {
    public static void main(String[] args) {
        // int x=Integer.parseInt(args[0]);
        // int y=Integer.parseInt(args[1]);
        int x =20;
        int y =20;
         for(int i=x;i<y;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    } 
}

