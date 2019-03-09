package Tests;

import java.io.*;
import java.util.HashMap;

public class ClearTriviaDuplicates {
    public static void main(String[] args) throws IOException {

        String filePath = "d:/trivia.questions.txt";
        HashMap<String, String> map = new HashMap<>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("@", 2);
            if (parts.length >= 2) {
                String key = parts[1];
                String value = parts[0];
                map.put(key.toUpperCase(), value.toUpperCase());
            } else {
                System.out.println("ignoring line: " + line);
            }
        }
        reader.close();


        File file = new File("d:/trivia.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            for (String key : map.keySet()) {
//                System.out.println(key + "@" + map.get(key));
                output.printf("%s|%s\n", map.get(key), key);
            }
            output.close();
        } catch (IOException ex) {
            System.out.printf("Error: %s \n", ex);
        }
    }
}