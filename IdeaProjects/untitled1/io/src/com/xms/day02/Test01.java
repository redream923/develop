package com.xms.day02;

import java.io.*;

/**
 * @author dpc
 * @create 2021-06-17 上午 11:13
 * 将桌面上的图片复制到io\iofile内
 */
public class Test01 {
    public static void main(String[] args) throws IOException {

//        封装源端,目的端
        File srcfile = new File("C:\\Users\\Administrator\\Desktop\\a.jpg");
        File destfile = new File("io\\iofile\\a.jpg");
        copyFile(srcfile, destfile);
/*        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\a.jpg");
        long length = file.length();
        System.out.println(length);
        byte[] bytes = new byte[(int)length];
        FileOutputStream fos=new FileOutputStream("io\\iofile\\a.jpg",true);
        fos.write(bytes);

        fos.close();
        fis.close();*/
    }

    private static void copyFile(File srcfile, File destfile) throws IOException {
//        创建流
        FileInputStream fis = new FileInputStream(srcfile);
        FileOutputStream fos = new FileOutputStream(destfile);
/*//        读写
//        1)每次读写1个字节
        int by = 0;
        while((by = fis.read()) != -1){
            fos.write(by);
        }*/

//        2)每次读写1个字节数组
        byte[] buf = new byte[1024];//开发中,一般字节数组长度为1024的倍数
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }

        fis.close();
        fos.close();
    }


}
