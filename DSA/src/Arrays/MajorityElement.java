package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MajorityElement {
	
	 public static int majorityElement(final int[] A) {
	        HashMap<Integer,Integer> ans=new HashMap<>();
	        for(int i=0;i<A.length;i++){
	            if(ans.containsKey(A[i])){
	                ans.put(A[i],ans.get(A[i])+1);
	            }else{
	                ans.put(A[i],1);
	            }
	            
	        }
	        int max=Integer.MIN_VALUE;
	        int key=0;
	        for(Map.Entry<Integer,Integer> entry:ans.entrySet() ){
	            if(max<entry.getValue()){
	                max=entry.getValue();
	                key=entry.getKey();
	            }
	        }
	        return key;
	      
	        
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
	int value=	majorityElement(num);
	System.out.println("Majority Element Value "+value);

	}

}
