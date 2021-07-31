package com.xms.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author dpc
 * @create 2021-06-24 17:23
 */
public class SendRunnable implements Runnable {
    DatagramSocket ds;

    public SendRunnable(DatagramSocket ds) {
         this.ds = ds;
    }

    @Override
    public void run() {
        try{
            //2)创建数据
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            String line = null;
            while((line=br.readLine())!=null){
                if("886".equals(line)){
                    break;
                }
                byte[] data = line.getBytes();

                //3)数据打包
                DatagramPacket dp = new DatagramPacket(data, data.length,
                        InetAddress.getByName("169.254.120.200"),4567);
                //4)发送数据
                ds.send(dp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //5)释放资源
            ds.close();
        }



    }
}
