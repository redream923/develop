package com.xms.day02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author dpc
 * @create 2021-06-17 下午 2:40
 * 转换输出流
 */
public class OutPutStreamWriterDame {
    public static void main(String[] args) throws IOException {
        demo1();
        demo2();


    }

    private static void demo2() throws IOException {
//        2)使用指定编码和指定字符流构造字符流
        OutputStreamWriter osw = new OutputStreamWriter( new FileOutputStream("io\\iofile\\4.txt"),"gbk");

//      写出数据
        osw.write("abc你好");
        osw.close();
    }

    private static void demo1() throws IOException {
        //        构造
//        1)使用默认编码和指定字节流构造字符
        OutputStreamWriter osw = new OutputStreamWriter( new FileOutputStream("io\\iofile\\3.txt"));


//        3)写出
//        3.1写出1个字符
        osw.write('a');
//        3.2写出一个字符数组
        char[] chars = {'A','B','C','D','E'};
        osw.write(chars);
//        3.3写出字符数组中的一部分
        osw.write(chars,0,2);
//        3.4写出1个字符串
        osw.write("hello");
//        3.5写出字符串中的一部分
        osw.write("world",1,3);

//        注意:字符流不会直接将数据写出到目的端,会现将数据存储到一个缓冲区内
//        只有调用flush()方法,才会将缓冲区内的数据全部写出
//        osw.flush();
//        流对象在关闭之前,会先执行flush()清空缓冲区数据
        osw.close();

    }
}
