package com.xms.day03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * @author dpc
 * @create 2021-06-18 下午 2:30
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        demo2();
    }

    //    集合功能(Hashtable的子类)
    private static void demo1() {
//        创建属性集
        Properties p = new Properties();
//        添加属性
        p.setProperty("001", "张三");
        p.setProperty("002", "李四");
        p.setProperty("003", "王五");
//        获取属性
        System.out.println(p.getProperty("001"));//"张三"
//        获取所有属性名
//        1)
        Set<String> ids = p.stringPropertyNames();
        for (String id : ids) {
            System.out.println(id);
        }
        System.out.println("------------------");
//        2)
        Enumeration<?> names = p.propertyNames();
        while (names.hasMoreElements()) {
            String key = (String) names.nextElement();
            System.out.println(key);
        }
    }

    //    配置功能
    private static void demo2() throws IOException {
        Properties p = new Properties();
//        加载数据(将配置文件中数据加载到属性集中)
        FileReader fr = new FileReader("io\\src\\student.properties");
        p.load(fr);
        System.out.println(p);

        p.setProperty("name", "张三丰");
        p.setProperty("age", "21");

//        存储数据(将属性集中数据存储到配置文件中)
        FileWriter fw = new FileWriter("io\\src\\student.properties");
        p.store(fw, "haha");

        fw.close();
        fr.close();
    }
}
