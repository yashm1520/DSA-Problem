package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedNumber {
	
	public static int repeatedNumber(final int[] A) {
        HashMap<Integer,Integer> temp=new HashMap<>();
        
        for(int i=0;i<A.length;i++){
            if(temp.containsKey(A[i])){
                return A[i];
            }
            temp.put(A[i],1);
        }
        
        return -1;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array");
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
	 int rep=	repeatedNumber(num);
	 System.out.println("repeated Number: "+rep);

	}

}
