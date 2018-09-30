package IO;

import java.io.*;

public class ByteStreams {
    public static void main(String[] args) throws IOException{
        InputStream in = new FileInputStream("input.txt");
        OutputStream out = new FileOutputStream("output.txt");
        int c;
        c = in.read();
        while(c != -1){
            System.out.println((char)c);
            out.write(c);
            c = in.read();
        }
    }
}