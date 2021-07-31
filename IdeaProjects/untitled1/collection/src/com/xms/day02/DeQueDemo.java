package com.xms.day02;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author dpc
 * @create 2021-06-15 上午 11:45
 */
public class DeQueDemo {
    public static void main(String[] args) {
//        双端队列
        Deque<String> deque=new LinkedList<>();
//        从一端进，从这一端出(先进后出)
//        入队
        deque.push("A");//压入元素
        deque.push("B");
        deque.push("C");
//        出队
        while (deque.size() != 0) {
            System.out.println(deque.pop());//弹出元素
        }

        System.out.println("----------------------------------");
//        从一端进，从另一端出(先进先出)
//        入队
        deque.offer("a");//压入元素
        deque.offer("b");
        deque.offer("c");
//        出队
        while (deque.size() != 0) {
            System.out.println(deque.poll());//弹出元素
        }
    }
}
