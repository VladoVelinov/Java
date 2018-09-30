package IO;

import java.io.*;

public class CharacterStreams {
    public static void main(String[] args) throws IOException{
        Reader in = new FileReader("input.txt");
        Writer out = new FileWriter("output.txt");
        try {

            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c = in.read();
            while (c != -1) {
                System.out.print((char) c);
                out.write(c);

                c = in.read();
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }finally {
            in.close();
            out.close();
        }
    }
}