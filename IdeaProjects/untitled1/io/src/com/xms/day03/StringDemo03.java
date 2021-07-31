package com.xms.day03;

import java.io.ByteArrayOutputStream;

/**
 * @author dpc
 * @create 2021-06-18 上午 11:06
 * 内存操作流
 *  将数据写出到内存中
 */
public class StringDemo03 {
    public static void main(String[] args) throws Exception {
//        创建内存字节输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        写出数据到内存中(在内存中创建了1个缓冲区,数据存储在缓冲区内)
        baos.write("hello".getBytes());
//        获取内存中的缓冲区
        byte[] buf = baos.toByteArray();

//        缓冲区中数据的有效个数
        int size = baos.size();

//        获取缓冲区数
        System.out.println(new String(buf,0,size));

//        使用默认字符集，将缓冲区内容转成字符串
        System.out.println(baos);

    }
}
