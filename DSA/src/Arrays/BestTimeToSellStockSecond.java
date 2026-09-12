package Arrays;

import java.util.Scanner;

public class BestTimeToSellStockSecond {
	
	
	  public static int maxProfit(int[] prices) {
	        int min=prices[0];
	        int profit=0;
	        for(int i=1;i<prices.length;i++){
	            if(min<prices[i]){
	               profit+=prices[i]-min;
	            }
	            min=prices[i];
	        }
	        return profit;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size ");
		int n=sc.nextInt();
		System.out.println("Please Enter The Array");
		int[] prices=new int[n];
		for(int i=0;i<n;i++) {
			prices[i]=sc.nextInt();
		}
		
		System.out.println("Max Profit is :" +maxProfit(prices));

	}

}
