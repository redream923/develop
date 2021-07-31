package com.xms.day01;

import java.io.File;

/**
 * @author dpc
 * @create 2021-06-16 下午 3:51
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("io\\iofile\\1.txt");
//        1）获取绝对路径
        System.out.println(file.getAbsolutePath());
//        2）获取构造路径
        System.out.println(file.getPath());
//        3）获取父目录(file)
        System.out.println(file.getParentFile());
//        4）获取父路径(String)
        System.out.println(file.getParent());
//        5）获取文件名
        System.out.println(file.getName());//1.txt
//        6）获取文件字节数
        System.out.println(file.length());//8
    }
}
