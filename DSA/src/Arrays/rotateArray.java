package Arrays;

import java.util.Scanner;

public class rotateArray {
	
	 public static void rotate(int[] nums, int k) {
	        k=k%nums.length;
	        reverse(nums,0,nums.length-1);
	        reverse(nums,0,k-1);
	        reverse(nums,k,nums.length-1);
	    }
	    public static void reverse(int[] nums,int left,int right){
	        while(left<right){
	        int temp=nums[left];
	        nums[left]=nums[right];
	        nums[right]=temp;
	   left++;
	   right--;
	        }

	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter Array Element");
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Please Enter The Rotation number");
		int rotation=sc.nextInt();
		rotate(nums,rotation);
		System.out.println("Array After Rotation");
		for(int i=0;i<n;i++) {
			System.out.println(nums[i]);
		}
		

	}

}
