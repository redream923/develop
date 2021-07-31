package com.xms.day01;



import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author dpc
 * @create 2021-06-16 下午 2:06
 * JavaSE资源的路径表示
 * 1）绝对路径
 * 以盘符开始，如D：\demo\1.txt
 * 2）相对路径
 * Eclipse中，以当前项目路径开始（不需要写），比如：demo\1.txt
 * IDEA中,以当前项目路径开始（不需要写），比如：io\iofile\1.txt
 *      注意：如果在IDEA的单元测试中，相对路径以当前模块开始
 */
public class FileDemo01 {
    public static void main(String[] args) throws IOException {
//        构造
//        1）通过文件的全路径构造file
//        1.1绝对路径
        File file = new File("");
        System.out.println(file);
//        1.2相对路径（以当前项目开始）
        File f2 = new File("io\\iofile\\1.txt");
        f2.createNewFile();

//        2）通过父路径和子路径创建file
        File f3 = new File("D:\\demo", "1.txt");

//        3)通过父File和子路径创建file
        File parent = new File("D:\\demo");
        File child = new File(parent, "1.txt");
    }

    @Test
    public void test() throws IOException {
//        相对路径以当前模块开始
        File f2 = new File("io\\iofile\\2.txt");
        f2.createNewFile();
    }

}
