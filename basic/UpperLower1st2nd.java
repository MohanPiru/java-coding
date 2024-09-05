public class Main
{
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		String str=" hello  guys welcome to my channel ";
		str=str.trim();
		int sum=0;
		sb.append(Character.toUpperCase(str.charAt(0)));
		for(int i=1;i<str.length()-1;i++){
		    char c=str.charAt(i);
		    if(str.charAt(i+1)==' ' ||str.charAt(i-1)==' ' )
		    sb.append(Character.toUpperCase(c));
		    else
		    sb.append(c);
		}
		sb.append(Character.toUpperCase(str.charAt(str.length()-1)));
		System.out.println(sb);
	}
}