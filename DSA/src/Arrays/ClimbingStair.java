package Arrays;

import java.util.Scanner;

public class ClimbingStair {
	
	  public static int climbStairs(int n) {
	      if(n<=2){
	        return n;
	      }
	      int first=1;
	      int second=2;
	      int third=0;
	      for(int i=3;i<=n;i++){
	        third=first+second;
	        first=second;
	        second=third;
	      }
	      return second;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		int n=sc.nextInt();
		
		int noOfWay=climbStairs(n);
		System.out.println("No Of Way "+noOfWay);

	}

}
