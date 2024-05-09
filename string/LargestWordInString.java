public class Main
{
	public static void main(String[] args) {
	    String str="My name is mohan";
	    
	    String[] s=str.split("\\s+");
	    
	    int max=0;
	    for (int i=0;i<s.length;i++){
	        if(s[i].length()>max){
	            max=i;
	        }
	    }
		System.out.println(s[max]);
	}
}
