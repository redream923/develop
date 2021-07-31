package com.xms.day01;

import java.io.File;

/**
 * @author dpc
 * @create 2021-06-16 下午 5:09
 * 删除指定目录
 * 比如删除桌面上的指定目录
 */
public class Test04 {
    public static void main(String[] args) {
        File floder = new File("C:\\Users\\Administrator\\Desktop\\demo");
        deleteFloer(floder);
    }

    private static void deleteFloer(File floder) {
//        判断floder是否为空
        File[] files = floder.listFiles();
        if (files.length == 0) {
            floder.delete();//直接删除空目录
        }else {
//            1)先删除floder下所有的文件和文件夹
            for(File file:files){
                if(file.isFile()){
                    file.delete();//删除文件
                }else {
                    deleteFloer(file);//删除文件夹
                }
            }
//            2)后删除floder
            floder.delete();
        }
    }
}
