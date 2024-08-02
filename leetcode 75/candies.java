/*  Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
*/



//arr is for candies array and n is the extracandy
class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int n) {
        List<Boolean> l=new ArrayList<Boolean>();
	   
		for(int i=0;i<arr.length;i++){
		    if(isMax(n+arr[i],arr))
		    l.add(true);
		    else
		    l.add(false);
		}
		return l;
    }
    public static boolean isMax(int a,int[] brr){
	    for(int j=0;j<brr.length;j++){
	        if(a<brr[j]){
	        return false;
	   
	        }
	    }
	    return true;
	    
	}
}