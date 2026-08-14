package Arrays;

import java.util.Scanner;

public class Maximum_Subarray {
	
	 public static int maxSubArray(int[] nums) {
	        int sum=0;
	        int max=nums[0];
	        int maxelement=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	           
	            sum+=nums[i];
	           
	            if(max<sum){
	                max=sum;
	            }
	             if(sum<0){
	                sum=0;
	            }
	        }
	        
	        return max;
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
	   int sum= maxSubArray(num);
		
		System.out.println("Maximum sub array sum "+sum);
	}

}
