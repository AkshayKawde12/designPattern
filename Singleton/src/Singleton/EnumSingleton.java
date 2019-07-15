package Singleton;

public class EnumSingleton 
{
	public static void main(String[] args)
	{
		EnumTest testEnum=EnumTest.Instance;
		testEnum.i=5;
		testEnum.show();
		testEnum.i=6;
		testEnum.show();
		//System.out.println(testEnum.hashCode());
		
	}
	enum EnumTest
	{
		Instance;
		int i;
		public void show() {
			System.out.println(i);
		}

	}
}
