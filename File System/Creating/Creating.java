package Creating;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Creating {
    public static void main(String[] args) {
        try {
            Path create1 = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Creating\\Examples",
                    "file2.txt");
            Files.createFile(create1);

            Path create2 = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Creating\\Examples",
                    "Dir5");
            Files.createDirectory(create2);

            Path create3 = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\Creating\\Examples",
                    "Dir1\\Dir6\\Dir7");
            Files.createDirectories(create3);

            Path create4 = FileSystems.getDefault()
                    .getPath("D:\\Niru\\Coding\\Java Programming\\Creating\\Examples\\Dir4\\Dir8\\Dir9\\Dir10");
            Files.createDirectories(create4);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
