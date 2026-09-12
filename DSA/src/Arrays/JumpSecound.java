package Arrays;

import java.util.Scanner;

public class JumpSecound {
	
	public static int jump(int[] nums) {

        if(nums.length==1){
            return 0;
        }
     
     int farthest=nums[0];
     int tempmaxfarthest=farthest;
     int jump=1;

     for(int right=0;right<=farthest;right++){
        if(tempmaxfarthest<nums[right]+right){
           tempmaxfarthest= nums[right]+right;
        }
        if(right==farthest){
            farthest=tempmaxfarthest;
            jump++;
        }
        
        if(farthest>=nums.length-1){
            return jump;
        }
     }


     return jump;
       

    }

	public static void main(String[] args) {
		

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array");
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		
		System.out.println("Max Profit is :" +jump(nums));
	}

}
