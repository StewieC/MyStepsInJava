package binarysearch1;

public class Datastructureslesson3 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,12,13,14,23,26,34,56,78};
		int target = 78;
		int ans = bsearch(arr,target);
		
		System.out.println("Your answer is in he index : "+ "["+ans+"]");
		
		System.out.println("the array length is: "+ arr.length );

	}
	
	static int bsearch (int[]arr, int target) {
		
		int start =0;
		int end = arr.length -1;
		
		while(start <= end) {
			//to find the middle element
			int mid = start + (end - start)/2 ;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target>arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
					
		}
		
		return -1;
	}

}
