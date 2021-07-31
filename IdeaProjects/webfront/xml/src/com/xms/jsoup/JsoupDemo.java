package com.xms.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author dpc
 * @create 2021-07-23 下午 2:25
 */
public class JsoupDemo {
    public static void main(String[] args) throws IOException {
        //获取资源路径
        String path = ClassLoader.getSystemClassLoader().getResource("student.xml").getPath();
        //解析xml,获取DOM树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取元素
        //1)
        Element name = document.getElementById("01");
        //2)
        Elements students = document.getElementsByTag("student");
        for (Element student : students) {
//            System.out.println(student);
        }
        //3)
        Elements stus = document.getElementsByAttribute("number");
        for (Element stu : stus) {
//            System.out.println(stu);
        }
        Elements eles = document.getElementsByAttributeValue("number","no1");
        for (Element ele : eles) {
//            System.out.println(ele);
        }
        //获取第1个学生的name元素
        Element firstStu = document.getElementsByAttributeValue("number", "no1").get(0);
        Element stuName = firstStu.getElementsByTag("name").get(0);

        //获取name元素上的id属性
        String id = stuName.attr("id");
//        System.out.println(id);

        //获取name里面的文本
//        System.out.println(stuName.text());
        //获取name里面的html代码
        System.out.println(stuName.html());
    }

}
