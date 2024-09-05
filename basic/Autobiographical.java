public class Main
{
	public static void main(String[] args) {
		
		int n=1210;
		String str=String.valueOf(n);
		
		
	
		System.out.println(auto(str));
		
		
	}
	
	public static boolean auto(String str){
	    for(int i=0;i<str.length();i++){
		    int count=0;
		    for(int j=0;j<str.length();j++){
		        if((i +'0')==str.charAt(j))
		        count++;
		    }
		    if(str.charAt(i)!=(count+'0'))
		    return false;
		    
		}
		return true;
	}
}