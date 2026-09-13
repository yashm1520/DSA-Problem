package Arrays;

import java.util.Scanner;

public class SingleNumber {
	
	 public static int singleNumber(int[] nums) {
	       int result = 0;

	        for (int num : nums) {
	            result = result ^ num;
	        }

	        return result;
	        
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
		int  single=singleNumber(num);
		System.out.println(single);

	}

}
