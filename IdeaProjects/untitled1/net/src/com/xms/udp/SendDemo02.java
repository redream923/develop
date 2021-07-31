package com.xms.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 创建UDP发送端的Socket对象
 创建数据
 数据打包
 发送数据
 释放资源
 */
public class SendDemo02 {
    public static void main(String[] args) throws IOException {
        //1)创建UDP发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();
        //2)创建数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
            byte[] data = line.getBytes();

            //3)数据打包
            DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("169.254.120.200"),4455);
            //4)发送数据
            ds.send(dp);
        }

        //5)释放资源
        ds.close();
    }
}
