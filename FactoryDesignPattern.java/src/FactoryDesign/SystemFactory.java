package FactoryDesign;

public class SystemFactory
{
public os getInstance(String str)
	{
		if(str.equalsIgnoreCase("Open"))
			return new Android();
		else if (str.equalsIgnoreCase("Closed"))
			return new Ios();
		else
			return new windows();
}
}
