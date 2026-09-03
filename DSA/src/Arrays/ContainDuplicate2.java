package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class ContainDuplicate2 {
	
	
	    public static boolean containsNearbyDuplicate(int[] nums, int k) {
	        HashMap<Integer,Integer> hashTemp=new HashMap<>();
	        int temp=0;
	        for(int i=0;i<nums.length;i++){
	          if(hashTemp.containsKey(nums[i]) && i-hashTemp.get(nums[i])<=k){
	                return true;
	            
	          }
	          hashTemp.put(nums[i],i);    
	        }
	      return false;

	    }
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter The Array Size");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array Element ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Please Enter The target :");
		int k=sc.nextInt();
		System.out.println( "Duplicate Exist : "+containsNearbyDuplicate(arr,k));

	}

}
