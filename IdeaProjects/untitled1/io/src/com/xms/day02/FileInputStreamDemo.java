package com.xms.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author dpc
 * @create 2021-06-17 上午 10:30
 * 文件字节输入流对象
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        构造
//        1)通过File构造文件字节输入流对象
        FileInputStream fis1 = new FileInputStream(new File("io\\iofile\\1.txt"));

//        2)通过文件路径构造文件字节输入流对象
        FileInputStream fis2 = new FileInputStream("io\\iofile\\1.txt");

//        3)读入
//        3.1)读一个字节
/*        int by;
        while ((by = fis1.read()) != -1) {
            System.out.println((char) by);
        }*/
//        3.2)读一个字节数组
        byte[] buf = new byte[5];
        int len = -1;//一次读5个字节,读出数据放到buff中,返回读出字节个数
        while ((len = fis1.read(buf)) !=-1) {
            System.out.println(new String(buf,0,len));
        }

//        释放资源
        fis2.close();
        fis1.close();
    }
}
