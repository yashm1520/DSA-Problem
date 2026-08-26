package Arrays;

import java.util.Scanner;

public class Stock_Buy_Sell {
public static int maxProfit(int[] prices) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i =0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            prices[i]=prices[i]-min;
            max=Math.max(prices[i],max);
        }

        return max;

    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
     System.out.println("Please Enter The Array Size");
     int n=sc.nextInt();
     System.out.println("Please Enter the Stocks Prices");
     int[] prices=new int[n];
     for(int i=0;i<n;i++) {
    	 prices[i]=sc.nextInt();
     }
     int maximumProfit=maxProfit(prices);
     System.out.println("Maximum Profit : "+maximumProfit);
     
	}

}
