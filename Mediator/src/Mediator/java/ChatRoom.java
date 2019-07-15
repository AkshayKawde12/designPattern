package Mediator.java;

import java.util.Date;

public class ChatRoom 
{	
	public static void showMessage(User User,String message)
	{
		System.out.println(new Date().toString()+"["+User.getName()+"]:"+ message);
	}
}
