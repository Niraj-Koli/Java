package Reading;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reading {
    public static void main(String[] args) {
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path path) throws IOException {
                return (Files.isRegularFile(path));
            }
        };

        Path directory = FileSystems.getDefault()
                .getPath("D:\\Niru\\Coding\\Java Programming\\Reading\\Examples\\Dir2");

        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
