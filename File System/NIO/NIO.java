package NIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NIO {
    public static void main(String[] args) {
        try {
            Path dataPath = FileSystems.getDefault().getPath("D:\\Niru\\Coding\\Java Programming\\NIO\\data.txt");

            Files.write(dataPath, "\nZeta".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

            List<String> lines = Files.readAllLines(dataPath);

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
