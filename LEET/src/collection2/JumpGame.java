package collection2;

/*
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 */

public class JumpGame {
	
	 public static boolean canJump(int[] A) {
	        boolean result = true;
	        if(A.length<2){
	        	return true;
	        }
	        int i = A.length-2;
	        int j = A.length-1;
	        while(i>=0){
	        	if(A[i]+i>=j){
	        		result = true;
	        		i-=1;
	        		j=i+1;
	        	} else {
	        		result = false;
	        		i-=1;
	        	}
	        }
	       
	        return result;
	    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,0,1};
		System.out.println(canJump(arr));
	}

}
