package com.xms.day02;

import java.io.*;

/**
 * @author dpc
 * @create 2021-06-17 下午 4:33
 * 缓冲字符输入输出流
 * 通过字符流进行构造
 * 需求:将D:\1.txt复制到io\iofile下,并重命名为1c.txt
 */
public class BufferedCharStreamDemo {
    public static void main(String[] args) throws IOException {
//        封装源端和目的端文件
        File src = new File("D:\\1.txt");
        File dest = new File("io\\iofile\\1c.txt");
//        复制文件
        copyFile(src, dest);
    }

    private static void copyFile(File src, File dest) throws IOException {
//        创建缓冲字符流
        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
//        读写操作
//        1)每次读写一个字符
/*        int ch = 0;
        while((ch=br.read()) != -1){
            bw.write(ch);
        }*/

//        2)每次读写一个字符数组
/*        char[] buf = new char[1024];
        int len=0;
        while ((len=br.read(buf))!=-1){
            bw.write(buf,0,len);
            bw.flush();
        }*/
//        3)每次读写一行数据()
//        String s = br.readLine();//返回读出的一整行数据,如果没有,返回null(不能读取换行符)
        String line = null;
        while ((line=br.readLine())!=null){
            bw.write(line);
//            bw.write("\n");
            bw.newLine();//换行
        }

//        释放资源
        bw.close();
        br.close();
    }
}
