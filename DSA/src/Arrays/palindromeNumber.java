package Arrays;

import java.util.Scanner;

public class palindromeNumber {
	
	 public static boolean isPalindrome(int x) {



	        String temp=String.valueOf(x);
	        String[] arr=temp.split("");

	        if(arr.length==1){
	            return true;
	        }
	        if(x<0){
	            return false;
	        }

	        int count1=0;
	        int count2=arr.length-1;

	        while(count1<count2){
	            if(arr[count1].equals(arr[count2])){
	                count1++;
	                count2--;
	            }else{
	                return false;
	            }
	        }

	        return true;
	        
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		int n=sc.nextInt();
	    boolean ans=	isPalindrome(n);
	    System.out.println("Palindrome "+ans);
	}

}
