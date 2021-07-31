package com.xms.day02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dpc
 * @create 2021-06-15 上午 11:24
 */
public class QueueDemo {
    public static void main(String[] args) {
//        创建队列
        Queue<String> queue=new LinkedList<>();
//        入队
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
//        获取队列元素
//        System.out.println(queue.peek());//"A"

//        出队
/*        int size=queue.size();
        for(int i=0;i<size;i++){
            System.out.println(queue.poll());
        }*/

        while (queue.size()!=0){
            System.out.println(queue.poll());
        }
    }
}
