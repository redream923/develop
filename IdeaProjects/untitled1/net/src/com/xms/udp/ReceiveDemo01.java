package com.xms.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 接收：
 创建UDP接收端的Socket对象
 创建数据包用于接收数据
 接收数据
 解析数据包
 释放资源
 */
public class ReceiveDemo01 {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket
        DatagramSocket ds = new DatagramSocket(8888);
        //创建数据包用于接收数据
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        //接收数据
        ds.receive(dp);
        //解析数据
        //1)获取接收数据的缓冲区
        byte[] data = dp.getData();
        //2）获取接收的字节数
        int len = dp.getLength();
        //3）解析数据
        String message = new String(data,0,len);
        //4）获取发送端IP字符串
        String ip = dp.getAddress().getHostAddress();
        //5）获取发送端端口号
        int port = dp.getPort();
        System.out.println("from "+ip+":"+port+" data is "+message);


    }
}
