import java.util.*; 
public class BalancedParanthesis {
	public static class stack{
		int top=-1;
		char array[]=new char[100];
		void push(char x)
		{
			if(top==99)
			{
				System.out.println("Stack is full");
			}
			else
			{
				array[++top]=x;
			}
		}
		void pop()
		{
			if(top==-1)
			{
				System.out.println("Stack is empty");
			}
			else
			{
				 char element = array[top]; 
	             top--;  
			}
		}
		boolean isEmpty()
		{
			return(top==-1);
					
		}	
	}
	static boolean isMatchingPair(char charter1,char charter2)
	{
		if(charter1=='(' && charter2==')')
			return true;
		if(charter1=='{' && charter2=='}')
			return true;
		if(charter1=='[' && charter2==']')
			return true;
		else
		{
			return false;
		}
	}
		static boolean isEquationIsBalanced(char exp[])
		{
			stack st=new stack();
			for(int i=0;i<exp.length;i++)
			{
				if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
		            st.push(exp[i]);
				if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
				{
					if(st.isEmpty());
					{
						return true;
					}
				}
				
			}
			return false;
		}
			
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("please enter equation");
				String s=sc.nextLine();
				char[] array=s.toCharArray();
				//char[] array= {'[','{','(',')','}',']'};
				if(isEquationIsBalanced(array))
				{
					System.out.println("it is balanced");
				}
				else
				{
					System.out.println("it is not balanced");
				}
				
			}
}