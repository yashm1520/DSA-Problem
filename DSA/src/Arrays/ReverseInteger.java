package Arrays;

import java.util.Scanner;

public class ReverseInteger {
	 public static int reverse(int x) {
	        

	       int value=x;
	        
	         long reverse=0;
	        
	        int remainder=0;
	       
	        while(x!=0){
	         remainder=x%10;
	         reverse=reverse*10+remainder;
	         x=x/10;

	         if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
	         return 0;
	         }
	        }
	       
	       
	        return (int)reverse;
	    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		int n=sc.nextInt();
		
	 int value=	reverse(n);
	System.out.println("Reverse Number "+value);

	}

}
