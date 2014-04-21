package collection2;

/*
 * Say you have an array for which the ith element is the price of a given 
 * stock on day i.

Design an algorithm to find the maximum profit. You may complete as many 
transactions as you like (ie, buy one and sell one share of the stock
 multiple times). However, you may not engage in multiple transactions at
  the same time (ie, you must sell the stock before you buy again).
  
 */
public class BestStock {

	public static int maxProfit(int[] prices) {
		if(prices==null||prices.length==0) return 0;
		int min = prices[0];
		int minpos = 0;
		int max = 0;
		int maxpos = 0;
		for(int i = 0;i<prices.length;i++){
			if(prices[i]>max){
				max = prices[i];
				maxpos = i;
			}
			if(prices[i]<min){
				min = prices[i];
				minpos = i;
			}
		}
		if(maxpos == minpos){
			return 0;
		} 
		
		int semin = prices[0];
		int seminpos = 0;
		for(int i=0;i<maxpos;i++){
			if(prices[i]<semin){
				semin = prices[i];
				seminpos = i;
			}
		}
		int semax = 0;
		int semaxpos = 0;
		for(int i=minpos;i<prices.length;i++){
			if(prices[i]>semax){
				semax = prices[i];
				semaxpos = i;
			}
		}
		System.out.println(max+" "+min+" "+semax+" "+semin);
		if((max-semin)>(semax-min)) {
			return max-semin;
		} else {
			return semax-min;
		}
    }
	public static void main(String[] args) {
		int[] arr = {7,2,4,1};
		System.out.println(maxProfit(arr));
	}

}
