/* Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
Logic -> repeat until i equals N.
O/P -> Print the year is a Leap Year or not.
*/
package bridegelabz.util;
import bridegelabz.util.Ptwo;

public class power {

	public static void main(String[] args) {
	//CREATING OBJECT OF Ptwo CLASS
	Ptwo ob=new Ptwo();
	// PASS INPUT FOR CALCULATION
	ob.powerOf2(22);
	}

}
