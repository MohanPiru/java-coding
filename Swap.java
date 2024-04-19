package Java;
class Number1{
    int m,n;
    void swap(){
        int temp;
        temp=m;
        m=n;
        n=temp;
        
    }
    void setter(int k,int j){
        m=k;
        n=j;
    }
    void printNum(){
        System.out.println("m="+ m+ "  n="+n);
    }
}
public class Swap {
    public static void main(String[] args) {
        
        Number1 obj =new Number1();
        obj.setter(12,34);
        obj.swap();
        obj.printNum();


        

    }
}
