package SerializationDemo;

import java.io.*;
public class SerializeDemo
		{
		public static void main(String [] args)
		{
			StudentDemo e = new StudentDemo();
			e.name = "Alice";
			e.address = "Magical Wonderland";
			e.SSN = 11122333;
			e.number = 101;
			try
			{
				FileOutputStream fileOut = new FileOutputStream("serialize.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(e);			//write the object
				out.close();
				fileOut.close();
				System.out.printf("Serialized data is saved in root directory");
			}catch(IOException i)
			{
				i.printStackTrace();
			}
		}
}
