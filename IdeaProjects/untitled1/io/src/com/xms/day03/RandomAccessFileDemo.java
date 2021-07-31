package com.xms.day03;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author dpc
 * @create 2021-06-18 下午 2:14
 * 随机访问流
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        demo1();
    }

    private static void demo1() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("io\\iofile\\random.txt", "rw");
//        写入1个字节
        raf.write(97);
//        写入1个int
        raf.writeInt(100);
//        写入1个String
        raf.writeUTF("hello");

//        设置指针位置
        raf.seek(0);
//        读1个字节
        int by = raf.read();
        System.out.println(by);
//        读1个int
        int a =raf.readInt();
        System.out.println(a);
//        读1个String
        String s =raf.readUTF();
        System.out.println(s);

        raf.close();
    }
}
