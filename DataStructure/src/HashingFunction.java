import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;
public class HashingFunction {
		static Node head[]=new Node[11];
		static class Node
		{
			int data;
			Node next;
			Node()
			{
				next=null;
			}
		Node(int n)
			{
				this.data=n;
				this.next=null;
			}
		}
		public static void search(int x)
		{
			int Number=x%11;

			Node newNode=new Node(x);
			Node CurrentNode=head[Number];
			Node prevNode=null;
			if(CurrentNode==null)
			{
				head[Number]=newNode;
			}
			else if(CurrentNode.next==null && x >CurrentNode.data){
			CurrentNode.next=newNode;
			return;
			}
			else if(CurrentNode.next==null  && x<CurrentNode.data){
				head[Number]=newNode;
				newNode.next=CurrentNode;
				}
			else
			{
				while(CurrentNode.next!=null && x>CurrentNode.data)
				{
					prevNode=CurrentNode;
					CurrentNode=CurrentNode.next;
					
				}
				if(CurrentNode.next==null && newNode.data < CurrentNode.data)
				{
					 prevNode.next=newNode;
					 newNode.next=CurrentNode;
				}
				else if(newNode.data>CurrentNode.data)
				{
					CurrentNode.next=newNode;
					return;
				}
			

}

		}
}