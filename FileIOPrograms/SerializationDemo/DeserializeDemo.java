package SerializationDemo;

import java.io.*;
public class DeserializeDemo
{
	public static void main(String [] args)
	{
		StudentDemo e = null;
			try
			{
				FileInputStream fileIn = new FileInputStream("serialize.txt");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				e = (StudentDemo) in.readObject();
				in.close();
				fileIn.close();
			}catch(IOException i)
			{
				i.printStackTrace();
			return;
			}catch(ClassNotFoundException c)
			{
				System.out.println("Student class not found");
				c.printStackTrace();
				return;
			}
			
		System.out.println("Deserialized Student...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);
	}
}
