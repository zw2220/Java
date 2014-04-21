package collection2;

public class RemoveDuplicate {

	 public static int removeDuplicates(int[] A) {
	        if(A==null||A.length==0) return 0;
	        int du = 0;
	        int compare = A[0];
	        for(int i = 1; i < A.length;i++){
	            if(A[i]==compare){
	                du++;
	            } else if(du>0) {
	            	compare = A[i];
	                A[i-du] = A[i];
	            } else {
	            	compare = A[i];
	            }
	        }
	        return A.length-du;
	    }
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,4,4};
		System.out.println(removeDuplicates(arr));
	}

}
