/*
 * Program-1: To write a program in Java that displays a message “Hello, World!”
 * 1. In this program will explain a structure of Java program.
 * 2. Follow camel case in giving the names of methods and variables
 * 3. Java is case sensitive
 */
public class firstProgram {		//creating a class which has name same as the file name.

	public static void main(String[] args) {   
		/*
		 * 4. class file having main() will be the executable file.
		 * 5. Every main() will be declared with access modifier as "public"
		 * 6. main() method holds a args[] of String type
		 * 7. main( ) is simply a starting place for the interpreter. A complex program 
		 * 	will have many classes, only one of which will need to have a main( ) method
		 *  to get things started. 
		 */
		
		System.out.println("Hello, World!");	
		/*
		 * 8. Every line should be ended with semicolon but for loops and function/methods definitions
		 * 9. System.out. System is a predefined class that provides access to the system, and out is 
		 * the output stream that is connected to the console.
		 * 10. println( ) displays the string which is passed to it in a new line.
		 */
		System.out.print("Good Morning. ");
		System.out.print("Beautiful day.");
		
		

	}

}
