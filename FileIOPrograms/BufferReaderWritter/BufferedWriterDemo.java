package BufferReaderWritter;

import java.io.*;		//do not this...reader, BufferReader, File writer class

class BufferedWriterDemo {
    public static void main(String args[]) throws Exception {
        Reader fr = new FileReader("TestFile.java");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("TestFileCopy.java");
        BufferedWriter bw = new BufferedWriter(fw);
        while (true) {
            String s = br.readLine();
            if (s == null) break;
            bw.write(s);
            bw.newLine();
        }
        bw.close();		//FILO
        fw.close();
        br.close();
        fr.close();
    }
}
