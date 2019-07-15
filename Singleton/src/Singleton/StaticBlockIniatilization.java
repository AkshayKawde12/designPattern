package Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class StaticBlockIniatilization implements Serializable {
	    private static StaticBlockIniatilization SBIObject;
	    
	    private StaticBlockIniatilization(){
	    	System.out.println("Static Block Initialization Creating...");
	    }
	    //static block initialization for exception handling
	    static{
	        try{
	            SBIObject = new StaticBlockIniatilization();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	    
	    public static StaticBlockIniatilization getInstance(){
	        return SBIObject;
	    }
}
class TestStaticBlockInitialization{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		StaticBlockIniatilization SBI1Object=StaticBlockIniatilization.getInstance();
		StaticBlockIniatilization SBI2Object=StaticBlockIniatilization.getInstance();
		System.out.println(SBI1Object.hashCode());
		System.out.println(SBI2Object.hashCode());
		///using Serialization and Deserialization
		ObjectOutputStream OOS =new ObjectOutputStream(new FileOutputStream("S2.ser"));
		OOS.writeObject(SBI2Object);
		ObjectInputStream OIS=new ObjectInputStream(new FileInputStream("S2.ser"));
		StaticBlockIniatilization SBI3Object=(StaticBlockIniatilization) OIS.readObject();
		System.out.println(SBI3Object.hashCode());
	}
}