import java.io.*;
class UseTrim {
	public static void main(String[] args)  {
		// create a BufferedReader using System.in
		String str = "  today is a beautiful day. ";
		/*
		 * trim()
		 * Eliminates blank characters from both ends of the string
		 */
		System.out.println("lenght of string before trim: "+str.length());
		String strTrim = str.trim();
		System.out.println(strTrim);
		System.out.println("lenght of string after trim: "+strTrim.length());
		
	}
}