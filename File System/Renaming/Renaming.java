package Renaming;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Renaming {
    public static void main(String[] args) {
        try {
            Path fileToMove = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Renaming\\Examples",
                    "file1.txt");
            Path destination = FileSystems.getDefault()
                    .getPath("D:\\Niru\\Coding\\Java Programming\\Renaming\\Examples", "file2.txt");

            Files.move(fileToMove, destination);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
