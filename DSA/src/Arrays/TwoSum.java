package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	    public static int[] twoSum(int[] nums, int target) {
	      
	       HashMap<Integer,Integer> temp=new HashMap();
	       for(int i=0;i<nums.length;i++){
	        temp.put(nums[i],i);
	       }
	       int j=0;
	       int remaining=0;
	       for(int i=0;i<nums.length;i++){
	        remaining=target-nums[i];
	        if(temp.containsKey(remaining)){
	    j=temp.get(remaining);
	      if(j!=i){
	        return new int[]{i,j};
	      }
	        }
	       }
	    return  new int[]{};
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
	int[] value=	twoSum(num,target);
	System.out.println(" Element Index Value "+Arrays.toString(value));

	}

}
