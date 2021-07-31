package com.xms.udp;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
发送端和接收端使用同一个界面
 */
public class ChatRoom {
    public static void main(String[] args) throws SocketException {
         //创建发送端和接收端的Scoket
        DatagramSocket sendDs = new DatagramSocket();
        DatagramSocket receiveDs = new DatagramSocket(4567);
        //创建发送端和接收端线程
        Thread t1 = new Thread(new SendRunnable(sendDs));
        Thread t2 = new Thread(new receiveRunnable(receiveDs));
        //启动线程
        t1.start();
        t2.start();
        
    }
}
