package Randoming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Randoming {
    public static void main(String[] args) {
        try (
                FileOutputStream binFile = new FileOutputStream(
                        "D:\\Niru\\Coding\\Java Programming\\Randoming\\data.dat");
                FileChannel binChannel = binFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);
            byte[] outputBytes1 = "Hello, World!\n".getBytes();

            buffer.put(outputBytes1);

            long int1Pos = outputBytes1.length;
            buffer.putInt(1007);

            long int2Pos = int1Pos + Integer.BYTES;
            buffer.putInt(-217362);

            byte[] outputBytes2 = "Nice to meet you.".getBytes();
            buffer.put(outputBytes2);

            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
            buffer.putInt(8734);
            buffer.flip();

            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile(
                    "D:\\Niru\\Coding\\Java Programming\\Randoming\\data.dat", "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
            channel.position(int3Pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int3 = " + readBuffer.getInt());
            readBuffer.flip();

            channel.position(int2Pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int2 = " + readBuffer.getInt());
            readBuffer.flip();

            channel.position(int1Pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int1 = " + readBuffer.getInt());

            byte[] outputString1 = "Hello, World!".getBytes();
            long str1Pos = 0;
            long newInt1Pos = outputString1.length;
            long newInt2Pos = newInt1Pos + Integer.BYTES;

            byte[] outputString2 = "Nice to meet you.".getBytes();
            long str2Pos = newInt2Pos + Integer.BYTES;
            long newInt3Pos = str2Pos + outputString2.length;

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(1007);
            intBuffer.flip();

            binChannel.position(newInt1Pos);
            binChannel.write(intBuffer);
            intBuffer.flip();

            intBuffer.putInt(-217362);
            intBuffer.flip();

            binChannel.position(newInt2Pos);
            binChannel.write(intBuffer);
            intBuffer.flip();

            intBuffer.putInt(4712);
            intBuffer.flip();

            binChannel.position(newInt3Pos);
            binChannel.write(intBuffer);

            binChannel.position(str1Pos);
            binChannel.write(ByteBuffer.wrap(outputBytes1));

            binChannel.position(str2Pos);
            binChannel.write(ByteBuffer.wrap(outputBytes2));

            ra.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
