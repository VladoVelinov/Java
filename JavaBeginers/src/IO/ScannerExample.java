package IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws IOException {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("input.txt"));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

        }catch (IOException ioe){}
        finally {
            if(sc != null)
                sc.close();
        }

    }
}