package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class wave_array {
	
	public static int[] wave(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++){
            if(i%2!=0){
                continue;
            }else{
                int temp=A[i];
                A[i]= A[i+1];
                A[i+1]=temp;
            }
            
        }
        return A;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array");
		int[] num=new int[n];
		for(int i=0;i<num.length;i++) {
		num[i]=sc.nextInt();
		}
		num=wave(num);
		for(int nums:num)
		System.out.print(" "+nums);

	}

}
