package Arrays;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
	//validParenthesis
	 public static boolean isValid(String s) {

	        if(s.length()==1){
	            return false;
	        }
	        
	       Stack<Character> temp=new Stack<>();
	        int count=0;
	        int n=s.length()-1;
	        while(n>=count){
	            if(s.charAt(count)=='('||s.charAt(count)=='{'||s.charAt(count)=='['){
	                temp.push(s.charAt(count));
	            }else if(!temp.isEmpty()){
	                char T=temp.pop();
	                if(s.charAt(count)==')' && T!='('){
	                 return false;
	                }else  if(s.charAt(count)=='}' && T!='{'){
	                 return false;
	                }else  if(s.charAt(count)==']' && T!='['){
	                 return false;
	                }
	               
	            }else{
	                return false;
	            }
	            count++;
	        }

	        return temp.isEmpty();
	    }
	

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String:");
		String s = sc.nextLine();
		
		boolean valid=isValid(s);
		System.out.println("Valid Parenthesis: "+ valid);

	}

}
