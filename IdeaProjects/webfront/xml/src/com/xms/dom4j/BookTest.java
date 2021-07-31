package com.xms.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author dpc
 * @create 2021-07-23 上午 11:55
 */
public class BookTest {
    public static void main(String[] args) throws DocumentException {
        //创建dom4j的解析器
        SAXReader reader = new SAXReader();
        //获取dom树
        Document document = reader.read("xml\\src\\book.xml");
        //获取根元素<books>
        Element rootElement = document.getRootElement();
        //获取根元素下面所有的子元素<book>
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            //获取元素上定义的属性(sn)
//            element.attribute("sn");
            //获取元素上定义的属性值
            String sn = element.attributeValue("sn");
            //获取当前元素下的name子元素
            Element nameEle = element.element("name");
            //获取name元素的文本
            String name = nameEle.getText();

            //获取子元素的文本
            double price = Double.parseDouble(element.elementText("price"));
            String[] author = {element.elementText("author")};

            //创建Book对象
            Book b = new Book(sn,name,price,author);
            System.out.println(b);

        }
    }
}
