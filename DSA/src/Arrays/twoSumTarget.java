package Arrays;

import java.util.Scanner;

public class twoSumTarget {
	
	 public static int[] twoSum(int[] numbers, int target) {
	        int left=0;
	        int right=numbers.length-1;
	        int sum=0;
	        
	        while(left<right){
	         sum=numbers[left]+numbers[right];
	           if(sum==target){
	            
	           return new int[]{left+1,right+1};
	           }
	            if(sum<target){
	               left++;
	            }else{
	                right--;
	            }
	            
	        }
	        return new int[0];
	        
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  System.out.println("Please Enter The Size Of Array");
	  int n=sc.nextInt();
	  int[] array=new int[n];
	  System.out.println("Please Enter The Array Element");
	  for(int i=0;i<n;i++) {
		  array[i]=sc.nextInt();
	  }
	  System.out.println("Please The Target Element");
	  int target=sc.nextInt();
	  int[] ans=twoSum(array,target);
	 
	  for(int i=0;i<ans.length;i++) {
		  System.out.print(ans[i]+" ");
	  }
	  

	}

}
