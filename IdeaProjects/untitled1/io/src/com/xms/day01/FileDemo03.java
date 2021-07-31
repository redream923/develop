package com.xms.day01;

import java.io.File;

/**
 * @author dpc
 * @create 2021-06-16 下午 3:45
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Administrator\\Desktop\\demo");
//        1）获取指定目录下所有文件和文件夹名称
        String[] names = folder.list();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------------------------");
//        2）获取指定目录下所有文件和文件夹的File对象
        File[] files = folder.listFiles();
        for (File file : files){
            System.out.println(file);
        }
    }
}
