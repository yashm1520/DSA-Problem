package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {

	 public static int threeSumClosest(int[] nums, int target) {
		    
		   int sum=0;
		   int closest=0;

		   Arrays.sort(nums);
		    closest=nums[0]+nums[1]+nums[nums.length-1];
		       for(int i=0;i<nums.length-2;i++){
		      int left=i+1;
		      int right=nums.length-1;
		      
		      while(left<right){
		        sum=nums[i]+nums[left]+nums[right];
		      
		        if(Math.abs(target-sum)<Math.abs(target-closest)){
		            closest=sum;
		           
		        }
		         if (sum < target) {
		                left++;
		            } 
		            else if (sum > target) {
		                right--;
		            } 
		            else {
		                return sum;
		            }
		        }
		        
		      }
		        
		       
		       return closest;
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
	int ans=	threeSumClosest(num,target);
	
	System.out.println("Closest Value to Target: "+ans);
	}

}
