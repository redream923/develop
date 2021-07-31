package com.xms.day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dpc
 * @create 2021-06-17 下午 3:05
 * 转换输入流
 */

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
//        构造(注意读写编解码方式要一致)
//        1)以默认编码和指定字节流构造
        InputStreamReader isr = new InputStreamReader(new FileInputStream("io\\iofile\\3.txt"));
//        2)以指定编码和指定字节流构造
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("io\\iofile\\4.txt"), "GBK");

//        3)读操作
//        3.1读一个字符
/*        int ch = isr.read();
        System.out.println((char) ch);*/

/*        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }*/

//        3.2读一个字符数组

/*        char[] chs = new char[5];
        int len = isr.read(chs);//返回读出的字符个数,读不到返回-1
        System.out.println(len);
        System.out.println(new String(chs,0,len));*/

        char[] chs = new char[5];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }
        System.out.println("-----------------------");
//        读取4.txt数据
        len = 0;
        while ((len = isr2.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }
        isr.close();
        isr2.close();
    }
}
