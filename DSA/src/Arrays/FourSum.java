package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        long sum=0;
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
    }
        for(int j=i+1;j<nums.length-1;j++){

             if (j > i + 1 && nums[j] == nums[j - 1]) {
            continue;
        }
            int left=j+1;
            int right=nums.length-1;
            while(left<right){
                sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
             if(target==sum){
               ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j],nums[left],nums[right])));

               while(left<right && nums[left]==nums[left+1] ){
              left++;
             }
             while(left<right && nums[right]==nums[right-1] ){
              right--;
             }
               left++;
               right--;

                
             }

            
             if(sum<target){
                left++;
             }else if(sum>target){
                right--;
             }
             
            
            }
        }

        }
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
		System.out.println("Please Enter the Target ");
		int target=sc.nextInt();
	List<List<Integer>> ans=	fourSum(num,target);
	
	for(List<Integer> value:ans) {
		
			System.out.println(value);
		
	}
	
	

	}

}
