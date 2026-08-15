package String;

import java.util.Scanner;

public class CommonPrefix {
	public static String longestCommonPrefix(String[] strs) {

		int min=Integer.MAX_VALUE;
		   for(int i=0;i<strs.length;i++){
		    if(min>strs[i].length()){
		        min=strs[i].length();
		    }
		   }

		   String ans=strs[0].substring(0,min);
		   for(int i=0;i<strs.length;i++)
		      
		       while(min>0){
		      if(ans.equals(strs[i].substring(0,min))){
		        break;
		      }
		        min--;
		        ans=ans.substring(0,min);
		      
		       }
		       return ans;
		    }
	/*
	 
	 class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(ans)) {

                ans = ans.substring(0, ans.length() - 1);

                if (ans.length() == 0) {
                    return "";
                }
            }
        }

        return ans;
    }
}
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array String");
		String[] num=new String[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.next();
			
		}
	String ans=	longestCommonPrefix(num);
	System.out.println("Common Prefix :"+ans);
	}

}
