package com.xms.udp;

import java.io.*;
import java.net.Socket;

/**
 * @author dpc
 * @create 2021-06-25 上午 9:54
 */
public class ClientDemo02 {
    public static void main(String[] args) throws IOException {
//        1)创建客户端套接字
        final Socket s = new Socket("169.254.163.18", 5555);
//        2)封装控制台录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        3)封装通道流,输出字符串
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//        4)录入数据
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
//            将缓冲区写到目的地(数据在缓冲区中)
            bw.flush();
//            自定义结结束标记
            if("886".equals(line)){
                break;
            }
        }
//        接收服务器的反馈
        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String info = br2.readLine();
        System.out.println(info);

//        6释放资源
        bw.close();
        s.close();
        br.close();
    }
}
