package Arrays;

import java.util.Scanner;

public class plusOne {
	
	 public static int[] plusOne(int[] digits) {

	     //plusone  
	        for(int i=digits.length-1;i>=0;i--){
	    if(digits[i]<9){
	     digits[i]++;
	     return digits;
	    }
	    digits[i]=0;

	        }
	        
	            int[] ans=new int[digits.length+1];
	            ans[0]=1;
	            return ans;
	        
	        
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
		 int[] ans=   plusOne(num);
         System.out.print(Arrays.toString(ans));

	}

}
