package Arrays;

import java.util.Scanner;

public class removeDuplicates {
	
	public static int removeDuplicates(int[] nums) {
        int n=1;
       

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[n]=nums[i+1];
                n++;
            }
            
        }
        return n;
      

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
	        
		int Unique=0;
		try {
			Unique = removeDuplicates(num);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Unique "+ Unique);
		
		
		
	}

}
