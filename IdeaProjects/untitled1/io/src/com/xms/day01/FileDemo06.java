package com.xms.day01;

import java.io.File;
import java.io.FileFilter;

/**
 * @author dpc
 * @create 2021-06-16 下午 4:59
 * 输出当前项目下所有.java文件的绝对路径，并统计其个数
 */
public class FileDemo06 {
    static int COUNT = 0;

    public static void main(String[] args) {

        File folder = new File(".");
        showAbsPath(folder);
        System.out.println(COUNT);


    }

    private static void showAbsPath(File folder) {
//        通过文件过滤器获取.java文件
        File[] files = folder.listFiles(new FileFilter() {
            @Override
//            pathname - floder下被查找的File对象
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    showAbsPath(file);
                }
                return file.getName().endsWith(".java");
            }
        });

        for(File file:files){
            COUNT++;
            System.out.println(file.getAbsolutePath());

        }
    }
}
