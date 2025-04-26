
import java.io.*;

class CompFiles
{
  public static void main(String[] args)
  {
    int i=0, j=0;

    String first_filename = "../Demo.txt";
    String second_filename = "../Demo1.txt";
    // Compare the files.
    try
    {
		FileInputStream f1 = new FileInputStream(first_filename);
        FileInputStream f2 = new FileInputStream(second_filename);
      // Check the contents of each file.
      do
      {
        i = f1.read();
        j = f2.read();
        if(i != j) break;
      } while(i != -1 && j != -1);

      if(i != j)
        System.out.println("Files differ.");
      else
        System.out.println("Files are the same.");
    }
    catch(IOException exc)
    {
      System.out.println("I/O Error: " + exc);
    }
  }
}
