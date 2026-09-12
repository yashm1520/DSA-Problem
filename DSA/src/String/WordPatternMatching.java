package String;

import java.util.HashMap;
import java.util.Scanner;

public class WordPatternMatching {
	
	 public static boolean wordPattern(String pattern, String s) {
	       String[] word=s.split(" ");
	       if(word.length!=pattern.length()){
	        return false;
	       }
	       HashMap<Character,String> patternKey=new HashMap<>();
	        HashMap<String,Character> wordKey=new HashMap<>();
	       for(int i=0;i<word.length;i++){
	        if(patternKey.containsKey(pattern.charAt(i))&&!patternKey.get(pattern.charAt(i)).equals(word[i])){

	      return false;
	        }
	         if(wordKey.containsKey(word[i])&&!wordKey.get(word[i]).equals(pattern.charAt(i))){

	      return false;
	        }
	        wordKey.put(word[i],pattern.charAt(i));
	        patternKey.put(pattern.charAt(i),word[i]);
	       }
	   return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Pattern");
		String pattern=sc.next();
		sc.nextLine();
		System.out.println("Please enter the S word string");
		String s=sc.nextLine();
		
		
		System.out.println("PatternMatching :" +wordPattern(pattern,s));

	}

}
