package String;

import java.util.Scanner;

public class RansonNote {
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
	       int[] ransonFreq=new int[26];
	        int[] magazfreq=new int[26];

	        for(int i=0;i<ransomNote.length();i++){
	            char ch=ransomNote.charAt(i);
	            ransonFreq[ch-'a']++;
	        }
	         for(int i=0;i<magazine.length();i++){
	            char ch=magazine.charAt(i);
	            magazfreq[ch-'a']++;
	        }
	        for(int i=0;i<26;i++){
	            if(ransonFreq[i]<=magazfreq[i]){
	                continue;
	            }
	            return false;
	        }
	   return true;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Ente the RansonNote");
		String RansonNote=sc.next();
		sc.nextLine();
		System.out.println("Please enter the magazine");
		String magazine=sc.nextLine();
		
		
		System.out.println("PatternMatching :" +canConstruct(RansonNote,magazine));

	}

}
