package com.xms;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author dpc
 * @create 2021-06-24 下午 2:29
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //        通过知己名或IP字符
        InetAddress addr1 = InetAddress.getByName("EKJ8CH45ZSOJSCI");
        System.out.println(addr1);
        InetAddress addr2 = InetAddress.getByName("169.254.163.18");
        System.out.println(addr2);
        System.out.println(addr1.equals(addr2));//true
        System.out.println(addr2 == addr1);//flase
        
//        獲取本地主機的IP
        InetAddress addr3 = InetAddress.getLocalHost();
        System.out.println(addr3);
        System.out.println(addr1 == addr3);

//        獲取IP對象的字符串
        System.out.println(addr3.getAddress());

//        获取主机名
        System.out.println(addr3.getHostName());
    }



}
