package com.xms.day01;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author dpc
 * @create 2021-06-16 下午 3:57
 * 输出当前项目下所有.java文件的绝对路径，并统计其个数
 */
public class Test03 {
    static int COUNT = 0;

    public static void main(String[] args) {

        File folder = new File(".");
        showAbsPath(folder);
        System.out.println(COUNT);

    }

    //    显示指定目录下.java文件的绝对路径
    private static void showAbsPath(File folder) {
//        获取folder下所有的.java文件
        File[] files = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                创建folder下的文件和文件夹
                File file = new File(dir,name);
                if(file.isDirectory()){
                    showAbsPath(file);
                }
                return name.endsWith(".java");
            }
        });
        for(File file : files){
            COUNT++;
            System.out.println(file.getAbsolutePath());
        }

    }


}
