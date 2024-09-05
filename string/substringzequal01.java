public class Main
{
	public static void main(String[] args) {
	   
	   String s="0100101";
	   String sub=null;
	   int max=0;
	   for(int i=0;i<s.length();i++){
	       for(int j=i+1;j<=s.length();j++){
	           sub=s.substring(i,j);
	           if(same(sub))
	           if(sub.length()>max)
	           max=sub.length();
	       }
	   }
		System.out.println(max);
		
	}
	
    public static boolean same(String str){
        int count=0;
	   for(int i=0;i<str.length();i++){
	       if(str.charAt(i)=='0')
	       count++;
	       else if(str.charAt(i)=='1')
	       count--;
	   }
	   return count==0?true:false ;
    }
	
}