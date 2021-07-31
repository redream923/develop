package com.xms.day02;

import java.io.*;

/**
 * @author dpc
 * @create 2021-06-17 上午 11:49
 */
public class BufferedByteStreamDemo {
    public static void main(String[] args) throws IOException {
        File srcfile = new File("C:\\Users\\Administrator\\Desktop\\a.jpg");
        File destfile = new File("io\\iofile\\a.jpg");
        copyFile1(srcfile, destfile);
//        copyFile2(srcfile, destfile);
    }


    //    缓冲字节流效率
    private static void copyFile2(File srcfile, File destfile) throws IOException {
//        创建缓冲字节流
//        注意:所有的流都是在字节流基础上衍生出来的(通过字节流去构造其他流)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destfile));
/*//        读写
//        1)每次读写1个字节
        int by = 0;
        while((by = fis.read()) != -1){
            fos.write(by);
        }*/

        long t1 = System.currentTimeMillis();
//        2)每次读写1个字节数组
        byte[] buf = new byte[100];//开发中,一般字节数组长度为1024的倍数
        int len = 0;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("缓冲字节流读写时间:" + (t2 - t1));

        bis.close();
        bos.close();
    }


    private static void copyFile1(File srcfile, File destfile) throws IOException {
//        创建流
        FileInputStream fis = new FileInputStream(srcfile);
        FileOutputStream fos = new FileOutputStream(destfile);
/*//        读写
//        1)每次读写1个字节
        int by = 0;
        while((by = fis.read()) != -1){
            fos.write(by);
        }*/

        long t1 = System.currentTimeMillis();
//        2)每次读写1个字节数组
        byte[] buf = new byte[100];//开发中,一般字节数组长度为1024的倍数
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("字节流读写时间:" + (t2 - t1));

        fis.close();
        fos.close();
    }
}
