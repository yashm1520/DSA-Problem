package Arrays;

import java.util.Scanner;

public class reverseString {
	
	 public static String reverseString(String A) {
	        StringBuilder ans =new StringBuilder();
	        
	        for(int i=0;i<A.length();i++){
	            ans.append(A.charAt(i));
	        }
	        ans.reverse();
	        return ans.toString();
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String ");
		String n=sc.nextLine();
		
		
	 String reverse=	reverseString(n);
	 System.out.println("Reverse String: "+reverse);

	}

}
