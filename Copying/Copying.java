package Copying;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Copying {
    public static void main(String[] args) {
        try {
            Path sourceFile = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Copying\\Examples",
                    "file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Copying\\Examples",
                    "file1copy.txt");

            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            sourceFile = FileSystems.getDefault()
                    .getPath("D:\\\\Niru\\\\Coding\\\\Java Programming\\\\Copying\\\\Examples", "Dir1");
            copyFile = FileSystems.getDefault()
                    .getPath("D:\\\\Niru\\\\Coding\\\\Java Programming\\\\Copying\\\\Examples", "Dir4");

            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
