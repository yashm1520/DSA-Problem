package Arrays;

import java.util.Scanner;

public class containerWithMostWater {

	 public static int maxArea(int[] height) {
	        int left=0;
	        int right=height.length-1;
	        int water=0;
	        int maximumwater=0;
	        while(left<right){
	        water=(right-left)*Math.min(height[left],height[right]);
	          maximumwater=Math.max(water,maximumwater);
	          if(height[left]<height[right]){
	           left++;
	          }else{
	            right--;
	          }
	        }
	        return maximumwater;
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
		System.out.println("Maximum Water can store :"+maxArea(arr));

	}

}
