package com.xms.day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author dpc
 * @create 2021-06-17 上午 9:57
 * 文件字节输出流
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        demo2();
    }

    private static void demo2() {
//        声明输出流
        FileOutputStream fos = null;
        try {
//            创建输出流
            fos = new FileOutputStream("io\\iofile\\2.txt", true);
//            写出数据
            fos.write(97);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            释放资源,关闭流对象
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //    构造
    private static void demo1() throws IOException {
//        通过指定File创建文件字节输出流
        File file = new File("io\\iofile\\1.txt");
        FileOutputStream fos1 = new FileOutputStream(file);

//            2）通过文件路径创建文件字节输出流
//            注意：如果文件不存在，執行構造的時候會創建文件
//            如果文件所在目錄不存在這時候會發成FileNotFountException
        FileOutputStream fos2 = new FileOutputStream("io\\iofile\\2.txt");

//            3）追加写出
        FileOutputStream fos3 = new FileOutputStream(file, true);
        FileOutputStream fos4 = new FileOutputStream("io\\iofile\\2.txt", true);

//            4）写出（覆盖写出）
//            4.1）写出一个字节
        fos1.write(97);
//            4.2）写出1个字节数组
        byte[] bys = {65, 66, 67, 68, 69};
        fos1.write(bys);

//            4.3）写出字节數組中的一部分
        fos1.write(bys, 1, 3);

//             5) 追加写出
        fos4.write("hello".getBytes());

//            6) 释放资源
        fos1.close();
        fos2.close();
        fos3.close();
        fos4.close();
    }
}
