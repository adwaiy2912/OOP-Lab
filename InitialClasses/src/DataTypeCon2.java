
public class DataTypeCon2 {

	public static void main(String[] args) {
		//Type conversion from int to String
		// create int type variable
	    int num = 10;
	    System.out.println("The integer value is: " + num);

	    // converts int to string type
	    String data = String.valueOf(num);
	    System.out.println("The string value is: " + data);
		
		// Type conversion from String to int
		String data1 = "101";
	    System.out.println("The string value is: " + data1);

	    // convert string variable to int
	    int num1 = Integer.parseInt(data1);
	    System.out.println("The integer value is: " + num1);

	}

}
