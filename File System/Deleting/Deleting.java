package Deleting;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Deleting {
    public static void main(String[] args) {
        try {
            Path deleteFile = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Deleting\\Examples",
                    "Dir1", "file1copy.txt");
            Path deleteFolder = FileSystems.getDefault()
                    .getPath("D:\\Niru\\Coding\\Java Programming\\Deleting\\Examples", "Dir4");

            Files.delete(deleteFile);
            Files.delete(deleteFolder);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
