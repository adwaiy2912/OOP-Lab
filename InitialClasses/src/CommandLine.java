/*
 * run time argument passing.
 * Passing values through command line.
 * adding the values passed
 */
public class CommandLine {

	public static void main(String[] args) {
		// convert into integer type
        int number1 = Integer.parseInt(args[0]);
        System.out.println("First Number: " +number1);
        int number2 = Integer.parseInt(args[1]);
        System.out.println("Second Number: " +number2);
        int result = number1 + number2;
        System.out.println("Addition of two numbers is: " +result);

	}

}
