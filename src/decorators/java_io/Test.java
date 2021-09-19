package decorators.java_io;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream lowCaseInputStream = new LowCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
        int c = -1;
        while ((c = lowCaseInputStream.read()) >= 0) {
            System.out.print((char) c);
        }
    }
}
