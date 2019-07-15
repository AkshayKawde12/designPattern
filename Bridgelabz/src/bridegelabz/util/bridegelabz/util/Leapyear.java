/*I/P -> Year, ensure it is a 4 digit number.
Logic -> Determine if it is a Leap Year.
O/P -> Print the year is a Leap Year or not.
*/
package bridegelabz.util;
import bridegelabz.util.Utility;
import bridegelabz.util.Leapy;

public class Leapyear {

	public static void main(String[] args) {
		
		Utility u = new Utility();
		             // INPUT DATA
					System.out.print("enter the year: ");
					String str = u.inputString();
					Leapy ab =new Leapy();
					ab.leapyear(str);
					

	}

}
