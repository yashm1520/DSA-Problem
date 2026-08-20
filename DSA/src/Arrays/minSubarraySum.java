package Arrays;

import java.util.Scanner;

public class minSubarraySum {
	
	 public static int minSubArrayLen(int target, int[] nums) {
	        int left=0;
	        int right=0;
	        int sum=0;
	       int min=Integer.MAX_VALUE;
	        int length=0;
	        int n=nums.length;



	        while(right<n){
	           
	           sum+=nums[right];
	           right++;
	         while(sum>=target){
	            length=right-left;
	            if(min>length){
	                min=length;
	            }
	            sum-=nums[left];
	            left++;
	         }
	            
	       
	        
	        }
	         
	          return min == Integer.MAX_VALUE ? 0 : min;

	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array");
		int[] num=new int[n];
		for(int i=0;i<num.length;i++) {
		num[i]=sc.nextInt();
		}
		System.out.println("Please Enter the Target ");
		int target=sc.nextInt();
		int min=minSubArrayLen(target,num);
		System.out.println("Minimum length: "+min);

	}

}
