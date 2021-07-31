package com.xms.udp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo02 {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket
        DatagramSocket ds = new DatagramSocket(4455);

        //创建数据包用于接收数据
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        //3)创建输出流
        FileOutputStream fos = new FileOutputStream("io\\iofile\\udp.txt") ;
        while(true){
            //接收数据
            ds.receive(dp);

            //解析数据
            //1)获取接收数据的缓冲区
            byte[] data = dp.getData();
            //2）获取接收的字节数
            int len = dp.getLength();
            //写出数据
            fos.write(data,0,len);
            fos.write("\n".getBytes());
        }
    }

}
