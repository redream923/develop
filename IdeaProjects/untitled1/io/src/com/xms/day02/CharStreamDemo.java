package com.xms.day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dpc
 * @create 2021-06-17 下午 2:28
 */
public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        demo1();
        System.out.println("----------");
        demo2();
    }

    private static void demo2() throws IOException {
        //    字符流读中文(不会出现乱码)
            FileInputStream fis = new FileInputStream("io\\iofile\\2.txt");
            InputStreamReader isr = new InputStreamReader(fis);
//        每次读一个字符数组
            char[] buf = new char[5];
            int len = 0;
            while ((len = isr.read(buf)) != -1) {
                System.out.print(new String(buf, 0, len));
            }
            fis.close();
    }


    //    字节流读中文(出现乱码)
    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("io\\iofile\\2.txt");
        byte[] buf = new byte[5];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            System.out.print(new String(buf, 0, len));
        }
        fis.close();
    }
}
