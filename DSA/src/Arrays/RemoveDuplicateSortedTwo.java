package Arrays;

import java.util.Scanner;

public class RemoveDuplicateSortedTwo {
	 public static int removeDuplicates(int[] nums) {
	        int flag=0;
	        int k=1;
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]==nums[i+1] && flag==0){
	             nums[k]=nums[i+1];
	             flag=1;
	             k++;
	            }
	             if(nums[i]!=nums[i+1] ){
	             nums[k]=nums[i+1];
	             flag=0;
	             k++;
	            }
	        }
	        return k;
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
		int k=removeDuplicates(num);
		System.out.println("Value "+ k);
	}

}
