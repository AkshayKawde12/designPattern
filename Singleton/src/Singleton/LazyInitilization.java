package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazyInitilization 
{
	private static LazyInitilization instance;
	private LazyInitilization()
	{
		System.out.
	}
	public static void main(String[] args)
	{
		abc obj=abcgetInstance();
	}
	class abc
	{
		public static abc obj;
		int i;
		private abc()
		{
			
		}
	}

	public static abc getInstance()
	{
		if(obj==null)
		{
			obj=new abc();
		}
		return obj;
	}
}