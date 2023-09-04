package Moving;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Moving {
    public static void main(String[] args) {
        try {
            Path fileToMove = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Moving\\Examples",
                    "file1copy.txt");
            Path destination = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Moving\\Examples",
                    "Dir1", "file1copy.txt");

            Files.move(fileToMove, destination);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
