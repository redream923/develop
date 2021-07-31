package com.xms.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 创建TCP客户端的Socket对象
 获取输出流，写数据
 释放资源
 */
public class ClientDemo01 {
    public static void main(String[] args) throws IOException {
        //1)创建TCP客户端的Socket对象
        Socket s = new Socket("169.254.120.200",6666);

        //2）获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello tcp".getBytes());

        //3）释放资源
        os.close();
        s.close();
    }
}
