package com.xms.day03;

import java.io.*;

/**
 * @author dpc
 * @create 2021-06-18 上午 10:15
 */
public class StreamDemo02 {
    public static void main(String[] args) throws IOException {
        Demo1();
        demo2();
    }

    private static void demo2() throws IOException {
//        数据输入流
        DataInputStream dis = new DataInputStream(new FileInputStream("io\\iofile\\data.txt"));
//        读写数据的操作需要保持一致
//        读1个Int
        int a = dis.readInt();
        System.out.println(a);
//        读1个char
        char c = dis.readChar();
        System.out.println(c);
//        读1个字符串
        String s = dis.readUTF();
        System.out.println(s);
    }

    private static void Demo1() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("io\\iofile\\data.txt"));
//        写入一个int数据(实际上是写入一个长度为4的字节数组)
        dos.writeInt(100);
//        写入1个char数据
        dos.writeChar('a');
//        写入字符串(一uft-8编码写入)
//        规则:先写入2个字节(表示字符串字节数),后写入字符串
        dos.writeUTF("abcde");

        dos.close();

    }
}
