package oops.java;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PhoneBook {
	 static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{	
		int Choice;
	
		System.out.println("---Enter your choice---");
		System.out.println("1.Show contact list");
		System.out.println("2.Add contact list");
		System.out.println("3.Edit contact list");
		System.out.println("4.Search contact list");
		System.out.println("5.delet contact list");
		//System.out.println("6.Exit");
		Choice=sc.nextInt();
		switch(Choice)
		{
		case 1:
			showContactList();
			break;
			
		case 2:
			addContactList();
			break;
			
		case 3:
			editContactList();
			break;
			
		case 4:
			searchContactList();
			break;
			
		case 5:
			deletContactList();
			break;
			
		default:
			System.out.println("Please Enter valid Choice");
			
		}sc.close();
	}
	static void showContactList() throws Exception{
		JSONParser Parser=new JSONParser();
		JSONArray object=(JSONArray)Parser.parse(new FileReader("/home/admin1/eclipse-workspace/Demo/src/com/Javaprograms/oops.java/src/oops/java/PhoneBook.json"));
		for(int i=0;i<object.size();i++)
		{
			JSONObject Details=(JSONObject)object.get(i);
			 System.out.println("Name :"+Details.get("Name"));
			 System.out.println("Contact Number :"+Details.get("Contact Number"));
			 System.out.println("Address :" +Details.get("Address"));
			 System.out.println(" ");

		}
	 }
	 @SuppressWarnings("unchecked")
	static void addContactList() throws IOException, ParseException
	 {
		 JSONParser Parser=new JSONParser();
		 JSONArray Data=(JSONArray)Parser.parse(new FileReader("/home/admin1/eclipse-workspace/Demo/src/com/Javaprograms/oops.java/src/oops/java/PhoneBook.json"));
		 
		 JSONObject object=new JSONObject();
		 System.out.println("Enter Name");
		 object.put("Name",sc.next());
		 System.out.println("Enter Contact Number");
		 object.put("Contact Number",sc.next());
		 System.out.println("Enter the Address");
		 object.put("Address",sc.next());
		 Data.add(object);
		 FileWriter file = new FileWriter("/home/admin1/eclipse-workspace/Demo/src/com/Javaprograms/oops.java/src/oops/java/PhoneBook.json");
		 file.write(Data.toString());
		 System.out.println("Successfully Copied JSON Object to File...");
		 //showContactList();
	file.close();		
	 }
	 
	 
	 static void editContactList()
	 {
		 
	 }
	 
	 static void searchContactList() throws FileNotFoundException, IOException, ParseException
	 {
		 boolean xyz=true;
		 Scanner sc=new Scanner(System.in);
		 JSONParser parser=new JSONParser();
		 JSONArray ContactList=(JSONArray)parser.parse(new FileReader("/home/admin1/eclipse-workspace/Demo/src/com/Javaprograms/oops.java/src/oops/java/PhoneBook.json"));
		 System.out.println("Enter your detail");
		 String detail=sc.nextLine();
		 for(int i=0;i<ContactList.size();i++)
		 {
			 JSONObject Detail=(JSONObject)ContactList.get(i);
			 if(detail.equals((String)Detail.get("Name")) || detail.equals((String)Detail.get("Address")) || detail.equals((String)Detail.get("Contact Number")))
			 {
				 System.out.println("Name :"+Detail.get("Name"));
				 System.out.println("Contact Number :"+Detail.get("Contact Number"));
				 System.out.println("Address :" +Detail.get("Address"));
				 xyz=false;
			 }
		 }
		 if(xyz)
		 {
			 System.out.println("No data Found");
		 }
	 }
	 static void deletContactList() throws FileNotFoundException, IOException, ParseException
	 {
		int i;
		//boolean xyz=true;
		JSONParser parser=new JSONParser();
		JSONArray ContactList=(JSONArray)parser.parse(new FileReader("/home/admin1/eclipse-workspace/Demo/src/com/Javaprograms/oops.java/src/oops/java/PhoneBook.json"));
		System.out.println("Enter Name  to edit");
		String name=sc.next();
		for(i=0;i<ContactList.size();i++)
		{
			JSONObject object=(JSONObject)ContactList.get(i);
			if(name.equals((String)object.get("Name")))// || key.equals((String)object.get("Contact Number")) || key.equals((String)object.get("Address")) )
			{
				
				ContactList.remove(i);
				//System.out.println(ContactList);
				FileWriter file = new FileWriter("/home/admin1/eclipse-workspace/Demo/src/com/Javaprograms/oops.java/src/oops/java/PhoneBook.json");
				file.write(ContactList.toString());
				System.out.println("Data is sucessfully deleted");
				file.close();
			}
		}
	 }
	 
	
}


