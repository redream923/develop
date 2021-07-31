package com.xms.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author dpc
 * @create 2021-07-23 下午 3:00
 */
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        String path = ClassLoader.getSystemClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements names = document.select("name");
        for (Element name : names) {
//            System.out.println(name);
        }
        
        //获取id=01的name元素
        Elements name = document.select("#01");
//        System.out.println(name);

        //获取number="no1"的student元素
        Elements stu = document.select("student[number='no1']");
//        System.out.println(stu);
        //获取number="no1"的age值
        String age = document.select("student[number='no1']>age").get(0).text();
        System.out.println(age);


    }
}
