/*----Data Type conversion----
 * Write a Java program to read an int number, double number 
 * and a char from keyboard and perform the following conversions: 
 * int to byte, char to int, double to byte, double to int. 
 */
import java.util.Scanner;

public class DataTypeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // accepting inputs from user
		
		System.out.println("Enter integer: ");
		int intInput = sc.nextInt();
		
		System.out.println("Enter double: ");
		double doubleInput = sc.nextDouble();
		
		System.out.println("Enter character: ");
		char charInput = sc.next().charAt(0);
		
		// performing conversions and displaying the result
		// int to byte
		byte intToByte = (byte)(intInput);   			
		System.out.println("Int to Byte: "+intToByte);
		
		// double to byte
		byte doubleToByte = (byte)(doubleInput); 		
		System.out.println("Double to Byte: "+doubleToByte);

		// double to int
		int doubleToInt = (int)(doubleInput); 			
		System.out.println("Double to Int: "+doubleToInt);
		
		// char to int (displays ascii value)
		int charToInt = (int)(charInput);				
		System.out.println("Char to Int: "+charToInt);
	}
}
