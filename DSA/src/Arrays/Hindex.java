package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Hindex {
	
	 public static int hIndex(int[] citations) {
	        Arrays.sort(citations);
	        int count=0;
	       
	        for(int i=citations.length-1;i>=0;i--){
	          if(citations[i]<=count){
	            return count;
	          }
	        count++;
	        }
	        return count;
	    }
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array");
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
  System.out.println("Hindex :"+hIndex(num));
	}

}
