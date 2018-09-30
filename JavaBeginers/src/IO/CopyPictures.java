package IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyPictures {
    public static void main(String[] args) {
        Path src = Paths.get("E:\\Nikon-D3400\\20180731\\DCIM\\100D3400");
        Path dest = Paths.get("E:\\Nikon-D3400\\20180731\\DCIM\\100D3400\\final_pick");

        File file = dest.toFile();
        String[] pictureNames = file.list();
        for(String name : pictureNames){
            System.out.printf("Starting process for %s%n", name);
            String[] tokens = name.split("\\.");
            for (String token : tokens) {
                System.out.println(token);
            }
            name = tokens[0];
            try {
                System.out.printf("Starting copy for %s from %s to %s%n", name, src, dest);
                Files.copy(Paths.get(src + "\\" +name + ".NEF"), Paths.get(dest +  "\\" +name + ".NEF"), StandardCopyOption.REPLACE_EXISTING);
            }catch (IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }
}