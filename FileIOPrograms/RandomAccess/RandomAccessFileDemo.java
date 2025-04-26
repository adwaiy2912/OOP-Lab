package RandomAccess;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("random.txt", "rw");
        // write something in the file
        file.write("Hello".getBytes());
        System.out.println(file.getFilePointer());  //returns the current offset of file
        
        // set the file pointer at 0 position
        file.seek(0);
        System.out.println(file.getFilePointer());		//points to seek(i) th charater.
        // print the line
        System.out.println(file.readLine());		//reads next line from the input file
        
        // set the file pointer at 10 position
        file.seek(10);   						//Sets the file-pointer offset, measured 
        										//from the beginning of this file, at which 
        										//the next read or write occurs.
        
        // write something in the file
        file.write("World".getBytes());			//second word
        
        // set the file pointer at 0 position
        file.seek(0);
        
        // print the line
        System.out.println(file.readLine());
        file.close();
    }
}
