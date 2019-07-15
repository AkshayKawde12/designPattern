
package bridegelabz.util;


public class Ptwo {

	public void powerOf2(int num) {
		
			// INITIALIZATION
			 int mul = 1;
			
			// CONDITION CHECK
			if (num > 31) {
				System.out.println("value of number should be less than 31");
				return;
			}

			// COMPUTATION
			else {
				System.out.println(mul);
				for (int j = 1; j <= num; j++) {
					mul = mul * 2;
					System.out.println(mul);
				}
			}

		
	}
}


	

