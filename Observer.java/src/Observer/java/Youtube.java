package Observer.java;

public class Youtube 
{
	public static void main(String[] args)
	{
		Channel1 Raw=new Channel1();
		
		Subscriber s1=new Subscriber("Akshay");
		Subscriber s2=new Subscriber("shubham");
		Subscriber s3=new Subscriber("sanket");
		Subscriber s4=new Subscriber("Afzal");
		
		
		
		Raw.subscribe(s1);
		Raw.subscribe(s2);
		Raw.subscribe(s3);
		Raw.subscribe(s4);
		
		s1.SubscriberChannel1(Raw);
		s2.SubscriberChannel1(Raw);
		s3.SubscriberChannel1(Raw);
		s4.SubscriberChannel1(Raw);
		
		Raw.upload("hello new video is out");
	}
}
