package com.xms.day01;

import java.util.Enumeration;
import java.util.Vector;

/**！！
 * @author dpc
 * @create 2021-06-11 下午 2:09
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

//        添加
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");
//        获取指定索引处的元素
        System.out.println(v.elementAt(0));

//        获取所有元素组成的枚举
        Enumeration elements = v.elements();
        while (elements.hasMoreElements()){//是否有更多元素
            String s =(String) elements.nextElement();//获取下一个元素
            System.out.println(s);
        }
    }
}
