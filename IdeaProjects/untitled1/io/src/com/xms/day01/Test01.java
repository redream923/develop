package com.xms.day01;

import java.io.File;

/**
 * @author dpc
 * @create 2021-06-16 下午 3:57
 * 输出当前项目下所有.java文件的绝对路径，并统计其个数
 */
public class Test01 {
    static int COUNT = 0;

    public static void main(String[] args) {

        File folder = new File(".");
        showAbsPath(folder);
        System.out.println(COUNT);

    }

    //    显示指定目录下.java文件的绝对路径
    private static void showAbsPath(File folder) {

//        获取folder下左右的的File
        File[] files = folder.listFiles();
//        遍历
        for (File file : files) {
            if (file.isFile()) {
//                判断是否为java文件
                if (file.getName().endsWith(".java")){
                    COUNT++;
                    System.out.println(file.getAbsolutePath());
                }
            } else {//是目录
//                查找目录下java文件
                showAbsPath(file);
            }
        }

    }


}
