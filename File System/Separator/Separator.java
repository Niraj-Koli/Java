package Separator;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Separator {
    public static void main(String[] args) {

        String separator = File.separator;
        System.out.println(separator);

        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        DirectoryStream.Filter<Path> filter = Files::isRegularFile;

        Path directory = FileSystems.getDefault()
                .getPath("D:\\Niru\\Coding\\Java Programming\\Separator\\Examples" + File.separator + "Dir2");

        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println();

        try {
            Path tempFile = Files.createTempFile("temporary", ".whocares");
            System.out.println("Temporary File Path = " + tempFile.toAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println();

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();

        for (FileStore store : stores) {
            System.out.println("Store = " + store);
            System.out.println("File Store = " + store.name());
        }

        System.out.println();

        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();

        for (Path path : rootPaths) {
            System.out.println("Root = " + path);
        }
    }
}
