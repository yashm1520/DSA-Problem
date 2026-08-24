package String;

import java.util.Scanner;

public class longestSubstringWithoutSubstring {
	
	 public static int lengthOfLongestSubstring(String s) {
	        int left=0;
	       
	        int max=Integer.MIN_VALUE;
	      //  String temp="";
	        StringBuilder temp=new StringBuilder();
	        int checker;
	        
	        for(int right=0;right<s.length();right++){
	            checker= temp.indexOf(String.valueOf(s.charAt(right)));
	          temp.append(s.charAt(right));
	        //  temp+=s.charAt(right);
	          if(checker!=-1){
	            left=left+checker+1;
	            temp.setLength(0);
	            temp.append(s.substring(left,right+1));
	          }
	          
	       max = Math.max(right-left+1, max);
	          
	        }
	        if(max<0){
	            return 0;
	        }
	        return max;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String");
		String s= sc.nextLine();
		
		int length=lengthOfLongestSubstring(s);
		System.out.println("Longest Substring length is : "+length);
		

	}

}
