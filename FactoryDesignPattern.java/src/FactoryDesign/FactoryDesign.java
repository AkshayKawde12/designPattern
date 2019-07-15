package FactoryDesign;
import java.util.Scanner;
public class FactoryDesign 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr os");
	String str=sc.nextLine();
	SystemFactory sf=new SystemFactory(); 
	os obj =sf.getInstance(str);
	obj.spec();
}
}
