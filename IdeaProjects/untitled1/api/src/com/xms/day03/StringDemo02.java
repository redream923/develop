package com.xms.day03;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-10 上午 10:40
 * 编码：字符串 -->字节数组  (看得懂 --->看不懂的二进制数据)
 * 解码：编码的逆过程，字节 --> 字符串 （看不懂的二进制数据 ---> 看得懂
 */
public class StringDemo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ab你好";
//        编码操作
//        1）以默认字符集(ytf-8)编码
        byte[] bt1 = s.getBytes();
//        [97, 98, -28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(bt1));

//        2）已指定字符集（GBK）编码
        byte[] bt2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bt2));
//        [97, 98, -60, -29, -70, -61]

//        解码操作
//        1）通过默认字符集对bt1进行解码
        String s1 = new String(bt1);
        System.out.println(s1);

//        2）通过gbk字符集对bt2进行解码
        String s2=new String(bt2,"GBK");
        System.out.println(s2);

//        注意编码解码一定要一致，不然会出现乱码
//        通过gbk对bt1进行解码
        String s3=new String(bt1,"GBK");
        System.out.println(s3);
//        ab浣犲ソ

    }
}
