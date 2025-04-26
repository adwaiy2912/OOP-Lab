package ConsoleDemo;

import java.io.*;

class ConsoleDemo {
    	public static void main(String args[]) {
    		String str;
    		Console con;                         // Obtain a reference to the console.
    		con = System.console();				//no object is created
    		
    		// If no console available, exit.
    		if(con == null) return;
    		
    		// Read a string and then display it.
	    	str = con.readLine("Enter a string: ");				//con.readLine()
	    	con.printf("Here is your string: %s\n", str);		//con.printf()
	    	
	    	Console c=System.console(); //creating a console object without constructors
	    	System.out.println("Enter password: ");
	    	char[] ch=c.readPassword();   
	    	
	    	String pass=String.valueOf(ch);//converting char array into string    
	    	//System.out.println("Password is: "+pass);
	    	c.printf("Here is your password: %s\n", pass);
    }
}
