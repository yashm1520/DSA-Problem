package String;

import java.util.Scanner;

public class ExcelSheetColumn {
	
	  public static String convertToTitle(int columnNumber) {
	        String ans="";
	        int n=columnNumber;
	        while(n>0){
	            n--;
	            int remainder=n%26;
	            ans=(char)('A'+remainder)+ans;
	            n=n/26;

	        }
	        return ans;
	    }

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		int n=sc.nextInt();
		String ans=convertToTitle(n);
		System.out.println("Excel Column Is "+ans);
		

	}

}
