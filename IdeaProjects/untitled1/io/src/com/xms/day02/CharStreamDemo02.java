package com.xms.day02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author dpc
 * @create 2021-06-17 下午 4:15
 * 字符流的读写操作
 * 需求:将D:\1.txt复制到io\iofile下,并重命名为1c.txt
 */
public class CharStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        封装源端和目的端文件
        File src = new File("D:\\1.txt");
        File dest = new File("io\\iofile\\1c.txt");
//        复制文件
        copyFile(src, dest);
    }

    private static void copyFile(File src, File dest) throws IOException {
//        字符流(简化装换流书写,使用默认编码,不可以指定编码)
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
//        每次写1个字符数组
        char[] buf = new char[1024];
        int len = 0;
        while ((len = fr.read(buf)) != -1){
            fw.write(buf,0,len);
        }
//        释放资源
        fr.close();
        fw.close();


    }
}
