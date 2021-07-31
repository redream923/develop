package com.xms.udp;

import java.io.IOException;
import java.net.*;

/**
 创建UDP发送端的Socket对象
 创建数据
 数据打包
 发送数据
 释放资源
 */
public class SendDemo01 {
    public static void main(String[] args) throws IOException {
        //1)创建UDP发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();
        //2)创建数据
        String info = "hello 你好";
        byte[] data = info.getBytes();

        //3)数据打包
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("169.254.120.200"),8888);
        //4)发送数据
        ds.send(dp);
        
        //5)释放资源
        ds.close();
    }
}
