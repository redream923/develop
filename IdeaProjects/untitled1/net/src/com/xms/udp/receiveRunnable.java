package com.xms.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author dpc
 * @create 2021-06-24 17:25
 */
public class receiveRunnable implements Runnable {
    DatagramSocket ds;
    public receiveRunnable(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            //创建数据包用于接收数据
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            while(true){
                //接收数据
                ds.receive(dp);

                //解析数据
                //1)获取接收数据的缓冲区
                byte[] data = dp.getData();
                //2）获取接收的字节数
                int len = dp.getLength();
                //写出数据
                System.out.println("data is:"+new String(data,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
