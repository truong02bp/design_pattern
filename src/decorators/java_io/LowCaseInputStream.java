package decorators.java_io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowCaseInputStream extends FilterInputStream {

    protected LowCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c =  super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] bytes, int offset, int len) throws IOException {
        int c = super.read(bytes, offset, len);
        for (int i=0; i < offset + c; i++) {
            bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
        }
        return c;
    }
}

