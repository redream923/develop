package com.xms.day01;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-16 下午 2:46
 */
public class FileDemo02 {


    //    系统分割符合名称分隔符
    @Test
    public void demo1() {
//        获取默认系统路径分隔符
        System.out.println(File.pathSeparator);//";"
        System.out.println(File.pathSeparatorChar);//';'
//        获取默认系统名称分隔符
        System.out.println(File.separator);//"\"
        System.out.println(File.separatorChar);//'\'


    }

    @Test
    public void demo2() throws IOException {
        File file = new File("iofile\\1.txt");
//        1)创建文件
        file.createNewFile();

        File folder = new File("iofile\\demo");
//        2)创建单级目录
        folder.mkdir();

        File folder2 = new File("iofile\\test\\new");
//        2)创建多级目录
        folder2.mkdirs();

//        4)删除文件
        file.delete();
//        5)删除目录（只能删除空目录）
        File folder3 = new File("iofile\\test");
        folder.delete();//删除删除单级目录
        folder3.delete();//删除多级目录

//        6）是否是文件
        System.out.println(file.isFile());//t
//        7）是否是文件夹
        System.out.println(file.isDirectory());//f
//        8）是否可读
        System.out.println(file.canRead());//t
//        9）是否可写
        System.out.println(file.canWrite());//t
//        10）是否隐藏
        System.out.println(file.isHidden());//f
//        11）是否存在
        System.out.println(file.exists());//t
//        12）获取最后修改时间毫秒值
        long time = file.lastModified();
        Date date = new Date(time);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
    }

}
