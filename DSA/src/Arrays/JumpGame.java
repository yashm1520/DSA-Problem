package Arrays;

import java.util.Scanner;

public class JumpGame {
	
	 public static boolean canJump(int[] nums) {
	     
	        int farthest=nums[0];
	        int left=0;
	        while(left<=farthest){
	        farthest=Math.max(farthest,left+nums[left]);
	        
	        if(farthest>=(nums.length-1)){
	            return true;
	        }
	        left++;
	        }
	        return false;
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
		boolean canJump=canJump(num);
		System.out.println(canJump);

	}

}
