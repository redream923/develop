package com.xms.day01;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author dpc
 * @create 2021-06-11 下午 3:43
 * 1)封装一个新闻类，包含标题和内容属性，提供get、set方法，重写toString方法，打印对象时只打印标题；（10分）
 *
 * 2)只提供一个带参数的构造器，实例化对象时，只初始化标题；并且实例化两个对象：
 * 新闻一：中国多地遭雾霾笼罩空气质量再成热议话题
 * 新闻二：春节临近北京“卖房热”
 *
 * 3)将新闻对象添加到ArrayList集合中，并且使用ListIterator倒序遍历；
 *
 * 4)在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前14个，然后在后边加“…”
 *
 * 5)在控制台打印遍历出经过处理的新闻标题；
 */
class News{
    private String titles;
    private String content;

    public News(String titles) {
        this.titles = titles;
    }



    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getTitles() {
        return titles;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "News{" +
                "titles='" + titles + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}

public class Test01 {
    public static void main(String[] args) {
        News n1 = new News("中国多地遭雾霾笼罩空气质量再成热议话题");
        News n2 = new News("春节临近北京\"卖房热\"");

        ArrayList list=new ArrayList();
        list.add(n1);
        list.add(n2);

        ListIterator li = list.listIterator();
//        正向遍历
        while (li.hasNext()){
             li.next();
        }
//        逆向遍历
        while (li.hasPrevious()){
            News n = (News) li.previous();
            String title=n.getTitles();
            if(title.length()>=15){
                title=title.substring(0,14).concat("...");
            }
            System.out.println(title);
        }

    }
}
