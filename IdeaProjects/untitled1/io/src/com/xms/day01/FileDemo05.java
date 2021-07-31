package com.xms.day01;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author dpc
 * @create 2021-06-16 下午 4:38
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Administrator\\Desktop\\demo");
//        1）通过文件名称过滤获取文件和目录的名称
        String[] names = folder.list(new FilenameFilter() {
            @Override
//            dir:被找到的文件所在的目录
//            name:被找到的文件的文件名
            public boolean accept(File dir, String name) {
//                只要.txt文件
//                1）创建被找到的文件/目录的File
                File file = new File(dir, name);
//                筛选
                return file.isFile() && name.endsWith(".txt");
            }
        });
        for(String name:names) {
            System.out.println(name);
        }
    }
}
