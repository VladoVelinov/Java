package IO;

import java.io.*;
import java.util.Scanner;


public class PrinterStreams {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new FileReader("input.txt"));
        PrintStream out = new PrintStream("output.txt", "Windows-1251");

        while (in.hasNextLine()) {
            out.println(in.nextLine());
        }

    }
}