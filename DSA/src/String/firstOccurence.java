package String;

import java.util.Scanner;

public class firstOccurence {
	
	public static int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        int count=0;

        if(n>h){
            return -1;
        }
        for(int i=0;i<=h-n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            if(count==n){
                return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String Hystack:");
		String h = sc.nextLine();
		
		System.out.println("Enter String needle:");
		String n = sc.nextLine();
		
		int valid=strStr(h,n);
		System.out.println("Occurence: "+ valid);


	}

}
