package Mediator.java;
public class MediatorPatternDemo 
{
	public static void main(String[] args)
	{
		User robert=new User("Robert");
		User john=new  User("john");
		
		robert.sendMessage("Hi!john!");
		john.sendMessage("Hello! Robert!");
	}
}
