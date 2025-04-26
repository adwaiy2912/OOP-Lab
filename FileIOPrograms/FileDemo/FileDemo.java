package FileDemo;

import java.io.File;
import java.util.Date;

class FileDemo {

    static void p(String s) {
        System.out.println(s);
    }
    
    //"File name: data.txt"
    public static void main(String args[]) {
        File f1 = new File("file2.txt"); 	//new object
        p("File Name: " + f1.getName());		//fetches the file name
        p("Path: " + f1.getPath());				//fetches file path
        p("Abs Path: " + f1.getAbsolutePath()); //fetches absolute file path
        p("Parent: " + f1.getParent());			//prints the parent of the file
        //p(statement()? "true" : " false");
        p(f1.exists() ? "exists" : "does not exist"); //verifies the file is present in the directory
        p(f1.canWrite() ? "is writeable" : "is not writeable"); //verifies the file can be written
        p(f1.canRead() ? "is readable" : "is not readable");    //verifies the file can be readable
        p("is " + (f1.isDirectory() ? "" : "not" + " a directory")); 
        p(f1.isFile() ? "is normal file" : "not a normal file"); 
        p("File last modified: " + f1.lastModified()); 		//print in the long int value 
        Date date = new Date(f1.lastModified());		//converted to Date format
        p(date.toString());
        Date dt = new Date();	
        p("Current Date: " + dt.toString());
        p("File size: " + f1.length() + " Bytes");
    }
}
