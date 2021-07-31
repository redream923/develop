package com.xms.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author dpc
 * @create 2021-06-25 上午 10:33
 * 将客户端本地的jdk_1.6.CHM上传到服务器D:file目录下
 */
public class UpLoadClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("169.254.163.18", 5555);
//        创建输入流,读取本地文件
        String srcfile = "C:\\Users\\Administrator\\Desktop\\资料\\jdk.API(1.6-1.9)\\JDK 1.6 API.chm";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
//        读取本地文件
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
            bos.flush();
        }
//        发送一个结束标记
/*        bos.write("886".getBytes());
        bos.flush();*/
        s.shutdownOutput();//告诉服务器客户端没有任何写出数据了

        //        接收服务器的反馈
        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String info = br2.readLine();
        System.out.println(info);

        bos.close();
        bis.close();
        s.close();
        br2.close();
    }

}
