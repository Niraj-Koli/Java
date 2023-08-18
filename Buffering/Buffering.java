package Buffering;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Buffering {
    public static void main(String[] args) {
        try (
                FileOutputStream binFile = new FileOutputStream(
                        "D:\\Niru\\Coding\\Java Programming\\Buffering\\data.dat");
                FileChannel binChannel = binFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);

            byte[] outputBytes1 = "Hello, World!".getBytes();
            byte[] outputBytes2 = "Nice to meet you.".getBytes();

            buffer.put(outputBytes1).putInt(1007).putInt(-217362).put(outputBytes2).putInt(3254);
            buffer.flip();

            // byte[] outputBytes1 = "Hello World!!!".getBytes();
            // buffer.put(outputBytes1);
            // buffer.putInt(1007);
            // buffer.putInt(-217362);
            // byte[] outputBytes2 = "Nice to meet you".getBytes();
            // buffer.put(outputBytes2);
            // buffer.putInt(3254);
            // buffer.flip();

            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("D:\\Niru\\Coding\\Java Programming\\Buffering\\data.dat",
                    "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);

            readBuffer.flip();

            byte[] inputString1 = new byte[outputBytes1.length];
            readBuffer.get(inputString1);

            System.out.println("inputString1 = " + new String(inputString1));
            System.out.println("int1 = " + readBuffer.getInt());
            System.out.println("int2 = " + readBuffer.getInt());

            byte[] inputString2 = new byte[outputBytes2.length];
            readBuffer.get(inputString2);

            System.out.println("inputString2 = " + new String(inputString2));
            System.out.println("int3 = " + readBuffer.getInt());

            ra.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
