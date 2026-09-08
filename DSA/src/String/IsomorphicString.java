package String;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
	  public static boolean isIsomorphic(String s, String t) {
	        HashMap<Character,Character> t1=new HashMap<>();
	          HashMap<Character,Character>t2 =new HashMap<>();

	          for(int i=0;i<s.length();i++){
	            char s1=s.charAt(i);
	            char s2=t.charAt(i);

	            if(t1.containsKey(s1)&&t1.get(s1)!=s2){
	                return false;
	            }
	              if(t2.containsKey(s2)&&t2.get(s2)!=s1){
	                 return false;
	             }
	            t1.put(s1,s2);
	            t2.put(s2,s1);


	          }
	   return true;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//hystack

		System.out.println("Enter String S ");
		String h = sc.nextLine();
		
		System.out.println("Enter String t ");
		String n = sc.nextLine();
		
		boolean valid=isIsomorphic(h,n);
		System.out.println("Occurence: "+ valid);

	}

}
