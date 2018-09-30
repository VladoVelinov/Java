package IO;

import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try{
            in = new BufferedReader(new FileReader("input.txt"));
            out = new BufferedWriter(new FileWriter("C:\\Users\\dsvetoslavov\\Desktop\\output.txt", true));

            int c = in.read();
            while (c != -1){
                out.append((char)c);
                c = in.read();
            }

        }catch (IOException ioe){}
        finally {
            if(in != null)
                in.close();
            if(out != null)
                out.close();
        }
    }
}