package com.xms.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-23 下午 4:16
 */
public class JsoupDemo03 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = ClassLoader.getSystemClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        JXDocument jxDocument = new JXDocument(document);
        List<JXNode> list = jxDocument.selN("//student");
        for (JXNode node : list) {
//            System.out.println(node);
        }
        //查询student下面所有的age子元素
        List<JXNode> list2 = jxDocument.selN("//student/age");
        for (JXNode node : list2) {
//            System.out.println(node);
        }

        //查询student下包含id属性的name元素
        List<JXNode> list3 = jxDocument.selN("//student/name[@id]");
        for (JXNode node : list3) {
            System.out.println(node);
        }



    }
}
