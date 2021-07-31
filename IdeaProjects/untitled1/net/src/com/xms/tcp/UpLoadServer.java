package com.xms.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author dpc
 * @create 2021-06-25 上午 10:33
 */
public class UpLoadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5555);
        final Socket s = ss.accept();
        InputStream is = s.getInputStream();
//        读取字节数组
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
//        5)创建输出流,写出到D:\file目录
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\file\\jdk6.chm"));

//        File f = new File("C:\\Users\\Administrator\\Desktop\\资料\\jdk.API(1.6-1.9)\\jdk api 1.8_google.CHM");
//        接收发送过来的数据,并写出到目的端
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = bis.read(buf)) != -1) {
/*            if("886".equals(new String(buf,0,len))){
                break;
            }*/
            bos.write(buf , 0,len);
            bos.flush();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write("发送成功!");
        bw.flush();

        bw.close();
        s.close();
        ss.close();
        is.close();
        bos.close();
        bis.close();


    }
}
