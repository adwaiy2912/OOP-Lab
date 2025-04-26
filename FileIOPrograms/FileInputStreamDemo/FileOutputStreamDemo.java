package FileInputStreamDemo;

import java.io.*;

class FileOutputStreamDemo {
		public static void main(String args[]) throws IOException {
			String source = "Now is the time for all of us\n"
							+ " to come together to restart\n"
							+ " a routine that was left behind.";
			byte buf[] = source.getBytes();
			OutputStream f0 = new FileOutputStream("file1.txt");
			for (int i=0; i < buf.length; i += 2) {
				f0.write(buf[i]);	//write()
			}
			f0.close();		//close()
			
			OutputStream f1 = new FileOutputStream("file2.txt");
			f1.write(buf);
			f1.close();
			OutputStream f2 = new FileOutputStream("file3.txt");
			f2.write(buf,buf.length-buf.length/4,buf.length/4);
			f2.close();
		}
}