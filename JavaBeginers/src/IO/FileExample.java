package IO;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("output.txt");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getTotalSpace());






        System.out.println("--------------------------");
        Path path = Paths.get("C:\\Windows");
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getName(0));
        System.out.println(path.getNameCount());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
    }

}