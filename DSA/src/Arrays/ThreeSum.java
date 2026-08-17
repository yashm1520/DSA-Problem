package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

	 public static List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
        ArrayList<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
           while(left<right){
                    int sum=nums[i]+nums[left]+nums[right];
                        if(sum<0){
                        left++;
                        }else if(sum>0){
                            right--;
                        }else{
                            ArrayList<Integer> triplet=new ArrayList<>();
                            triplet.add(nums[i]);
                             triplet.add(nums[left]);
                              triplet.add(nums[right]);
                           
                            ans.add(triplet);
      
                        
                        while(left<right&& nums[left]==nums[left+1]){
                            left++;
                        }
                         while(left<right&& nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
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
		List<List<Integer>> ans=	threeSum(num);
		
		for (List<Integer> list : ans) {
		    System.out.println(list);
		}
		
	}

}
