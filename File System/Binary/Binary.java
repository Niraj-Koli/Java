package Binary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Binary {
    public static void main(String[] args) {
        try (
                FileOutputStream binFile = new FileOutputStream("D:\\Niru\\Coding\\Java Programming\\Binary\\data.dat");
                FileChannel binChannel = binFile.getChannel()) {

            byte[] outputBytes = "Hello, World!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);

            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(1007);

            intBuffer.flip();

            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            intBuffer.flip();

            intBuffer.putInt(-219362);

            intBuffer.flip();

            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            System.out.println();

            RandomAccessFile ra = new RandomAccessFile("D:\\\\Niru\\\\Coding\\\\Java Programming\\\\Binary\\\\data.dat",
                    "rwd");
            FileChannel channel = ra.getChannel();

            outputBytes[0] = 'A';
            outputBytes[1] = 'B';

            buffer.flip();

            long numBytesRead = channel.read(buffer);

            if (buffer.hasArray()) {
                System.out.println("Byte buffer = " + new String(buffer.array()));
            }
            System.out.println("BytesRead = " + numBytesRead);

            // Absolute read //
            intBuffer.flip();

            numBytesRead = channel.read(intBuffer);

            System.out.println(intBuffer.getInt(0));
            System.out.println("BytesRead = " + numBytesRead);

            intBuffer.flip();

            numBytesRead = channel.read(intBuffer);

            System.out.println(intBuffer.getInt(0));
            System.out.println("BytesRead = " + numBytesRead);

            // Relative read //
            // intBuffer.flip();
            // numBytesRead = channel.read(intBuffer);
            // intBuffer.flip();
            // System.out.println(intBuffer.getInt());
            // intBuffer.flip();
            // numBytesRead = channel.read(intBuffer);
            // intBuffer.flip();
            // System.out.println(intBuffer.getInt());

            ra.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}