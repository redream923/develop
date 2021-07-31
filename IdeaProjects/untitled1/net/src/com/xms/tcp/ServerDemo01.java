package com.xms.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 接收：
 创建TCP服务器端的Socket对象
 监听客户端连接
 获取输入流，读取数据
 释放资源
 */
public class ServerDemo01 {
    public static void main(String[] args) throws IOException {
        //1)创建TCP服务器端的Socket对象
        ServerSocket ss = new ServerSocket(6666);

        //2）监听客户端连接
        Socket s = ss.accept();

        //3）获取输入流，读取数据
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        System.out.println(new String(buf,0,len));


        //释放资源
        is.close();
        s.close();
        //服务器不需要释放
        //ss.close();
    }
}
