package Arrays;

import java.util.Scanner;

public class insertIndex {
	
	
	  public static int searchInsert(int[] nums, int target) {
	        
	        int left=0;
	        int right=nums.length-1;


	        while(left<=right){

	            int mid=left+(right-left)/2;
	            if(nums[mid]==target){
	                return mid;
	            }else if(nums[mid]>target){
	                right=mid-1;
	            }else{
	                left=mid+1;
	            }
	        }
	        return left;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array");
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Please Enter the Target ");
		int target=sc.nextInt();
		int index=searchInsert(num,target);
		System.out.println("Index "+index);

	}

}
