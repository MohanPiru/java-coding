public class Main
{
	public static void main(String[] args) {
		
		int[] arr={2,5,-1,4,-1,9,-1,8,-1,-1};
		int n=arr.length;
		int j=n-1;
		for(int i=n-1;i>=0;i--){
		    if(arr[i]!=-1){
		        arr[j]=arr[i];
		        j--;
		    }
		}
		for(int i=0;i<=j;i++){
		    arr[i]=-1;
		}
		
		for(int i:arr){
		    System.out.print(i +" ");
		}
	}
}
