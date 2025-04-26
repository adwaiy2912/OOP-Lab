/*
 * Directory is a File that contains a list of other files and directories 
 */
package DirectoryDemo;

import java.io.File;

class DirectoryDemo {
    public static void main(String args[]) {
        String dirname = "D:\\Adwaiy\\Projects\\Java\\OOP Programs";	//path of dir
        File f1 = new File(dirname);
//        File f1 = new File("dir");

        if (f1.isDirectory()) {			//method returns true if the directory exist
            System.out.println( dirname + " is Directory! " );
            String s[] = f1.list();		//list[dir1, dir2, data.txt, sample.txt] provides all other files and dir

            //print all the files and dir within 'dirname'
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                //dirname/dir1, dirname/dir2....
                if (f.isDirectory()) {	//this loop checks for type of file/dir
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
