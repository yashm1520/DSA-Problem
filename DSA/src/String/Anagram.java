package String;

import java.util.Scanner;

public class Anagram {
	
	 public static boolean isAnagram(String s, String t) {
	        int[] temp=new int[26];

	        if(s.length()!=t.length()){
	          return  false;
	        }
	       

	        for(int i=0;i<s.length();i++){

	          
	           temp[s.charAt(i)-'a']++;
	           temp[t.charAt(i)-'a']--;
	        }
	       
	        for(int i=0;i<26;i++){
	            if(temp[i]!=0){
	                return false;
	            }
	        }

	        return true;
	    }

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("First String");
		String s = sc.nextLine();
		
		System.out.println("Second String");
		String t = sc.nextLine();
		
		boolean valid=isAnagram(s,t);
		System.out.println("Valid Anagram: "+ valid);

	}

}
