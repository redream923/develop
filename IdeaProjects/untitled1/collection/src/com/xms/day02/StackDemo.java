package com.xms.day02;

import java.util.Stack;

/**
 * @author dpc
 * @create 2021-06-15 上午 11:53
 */
public class StackDemo {
    public static void main(String[] args) {
//        创建栈
        Stack<String> stack=new Stack<>();
//        压栈
        stack.push("hello");
        stack.push("world");
        stack.push("java");

//        获取栈顶元素
        System.out.println(stack.pop());

//        弹栈
        while (stack.size() != 0) {
            System.out.println(stack.pop());
        }
    }
}
