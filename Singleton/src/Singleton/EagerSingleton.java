package Singleton;

public class EagerSingleton 
{
	private static  EagerSingleton instance;
	private static EagerSingleton EagerObject= new EagerSingleton();
	private EagerSingleton()
	{
		System.out.println("here is Eager initilzatioin");
	}
	public static EagerSingleton getEagerObject()
	{
		return EagerObject;
	}
}
class TestEager
{
	public static void main(String[] args)
	{
		EagerSingleton E1Object =EagerSingleton.getEagerObject();
		System.out.println(E1Object.hashCode());
		EagerSingleton E2bject =EagerSingleton.getEagerObject();
		System.out.println(E2bject.hashCode());
	}
}
