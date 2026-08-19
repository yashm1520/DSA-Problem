package String;

import java.util.Scanner;

public class validPalindrome {

	public static boolean isPalindrome(String s) {
        String result=s.replaceAll("[^0-9A-Za-z]","").toLowerCase();
       // result= result.toLowerCase();
        int left=0;
        int right=result.length()-1;
        while(left<right){
            if(result.charAt(left)!=result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String:");
		String s = sc.nextLine();
		
		System.out.println("Valid Palindrome"+isPalindrome(s));

	}

}
