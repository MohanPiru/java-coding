import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		int[] arr={4,12,7,14,3,9};
		PriorityQueue<Integer> pq=new PriorityQueue(); //minHeap
		
	//	PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++){
		    pq.offer(arr[i]);
		}
		for(int i=0;i<arr.length;i++){
		    arr[i]=pq.poll();
		}
		System.out.println(Arrays.toString(arr));
		
	}
}