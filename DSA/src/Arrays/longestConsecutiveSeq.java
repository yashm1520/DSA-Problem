package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class longestConsecutiveSeq {
	
	 public static int longestConsecutive(int[] nums) {
	        if(nums.length==0){
	            return 0;
	        }
	        int max=1;
	        int count=1;
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++){
	         if(nums[i+1]-nums[i]==1){
	        count++;
	         }else if(nums[i+1]==nums[i]){
	            continue;
	         }
	         else{
	            count=1;
	         }
	         max=Math.max(count,max);

	        }
	        return max;
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
		int consecutive=longestConsecutive(num);
        System.out.println("Consecutive "+consecutive);
	}

}
