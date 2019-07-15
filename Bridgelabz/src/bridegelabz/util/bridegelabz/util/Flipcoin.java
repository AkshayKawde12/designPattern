/*I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails
*/
package bridegelabz.util;

import bridegelabz.util.Flipc;


public class Flipcoin {
	public static void main(String[] args) {
		// INPUT DATA
		Utility u = new Utility();
		System.out.print("enter no. of times you want to flip the coin: ");
		int n = u.inputInteger();
		
		//CREATING OBJECT OF Flipc CLASS
		Flipc ab =new Flipc();
		ab.flip(n);
		
		
		
	}

}
