package com.xms.day03;

import java.io.*;

/**
 * @author dpc
 * @create 2021-06-18 上午 9:43
 * 标准输入输出流
 */
public class StreamDemo01 {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        demo3();
    }

    private static void demo3()throws IOException {
//       改变标准输入输出流
//        需求:用"标准输入流读取io\iofile\1.txt内容,通过"标准输出流写出到D:\1c.txt中""
        System.setIn(new FileInputStream("io\\iofile\\1.txt"));
        System.setOut(new PrintStream("D:\\1c.txt"));

//        获取"标准"输入输出流
        InputStream is = System.in;
        PrintStream ps = System.out;
//        读写
        int by = 0;
        while ((by=is.read())!=-1){
            ps.write(by);
        }

    }


    private static void demo2() {
//       标准输出流
        PrintStream ps = System.out;
//        写出数据(默认写出到控制台)
        ps.write(97);
        ps.close();
    }

    private static void demo1() throws IOException {
//        标准输入流
        InputStream is = System.in;
//        读数据(获取键盘录入的数据)
        System.out.println("请输入数据");
        int by = is.read();
        System.out.println((char) by);

//        释放资源
//        is.close();

//        标准输入流只能读取一个字节或者字节数组.现在想要读取一个字符串
//        需要封装标准输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数据");
        br.readLine();
        String s = br.readLine();
        System.out.println(s);

        br.close();
    }
}
