package JDBC1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo 
{
public static void main(String[] args)
{
	int Count=0;
	Pattern P=Pattern.compile("[a-z1-9][a-z]@gmail.com");
	Matcher m=P.matcher("abab7aabbab@gmail.com");
	while(m.find())
	{
		Count++;
		System.out.println(m.start()+".."+m.group());
	}
	System.out.println("Total number of occurance " +Count);
}
}
