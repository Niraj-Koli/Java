package Attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Attributes {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("D:\\Niru\\Coding\\Java Programming\\NIO\\data.txt");

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attributes.size());
            System.out.println("Directory = " + attributes.isDirectory());
            System.out.println("Key = " + attributes.fileKey());
            System.out.println("File = " + attributes.isRegularFile());
            System.out.println("Link = " + attributes.isSymbolicLink());
            System.out.println("Different = " + attributes.isOther());
            System.out.println("Creation Time = " + attributes.creationTime());
            System.out.println("Access Time = " + attributes.lastAccessTime());
            System.out.println("Modified Time = " + attributes.lastModifiedTime());

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
