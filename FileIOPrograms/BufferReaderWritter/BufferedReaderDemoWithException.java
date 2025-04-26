package BufferReaderWritter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderDemoWithException {
    public static void main(String args[]) {
        try (BufferedReader br = new BufferedReader(new FileReader("TestFile.java"))) {
            while (true) {
                String s = br.readLine();
                if (s == null) break;
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
