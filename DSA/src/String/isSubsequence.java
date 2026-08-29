package String;

import java.util.Scanner;

public class isSubsequence {
	
	 public static boolean isSubsequence(String s, String t) {
	        if(s.length()==0){
	            return true;
	        }
	        int count=0;
	        for(int i=0;i<t.length();i++){
	            if(t.charAt(i)==s.charAt(count)){
	                count++;
	            }
	            if(count==s.length()){
	                return true;
	            }
	        }
	        return false;

	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the First Main String");
		String t=sc.nextLine();
		System.out.println("Please Enter The Second String");
		String s=sc.nextLine();
		boolean isSubsequence=isSubsequence(s,t);
		System.out.println("Is subsequence : "+isSubsequence);

	}

}
