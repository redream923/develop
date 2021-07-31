package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-15 上午 9:45
 */
//写一个类MyLinked，实现双向循环链表的操作
class MyLinked<E> {
    Node node;//当前节点
    int size;//集合长度
    Node first;//第一个节点

    boolean add(E e) {
//        构造节点
        node = new Node();
        node.e = e;
//        判断是否为第一个节点
        if (first == null) {
            node.pre = node;
            node.next = node;
            first = node;
        } else {
            first.pre.next = node;
            node.next = first;
            node.pre = first.pre;
            first.pre = node;
        }
        size++;
        return true;
    }

    boolean remove(E e) {
//        获取当前节点（从第一个节点开始）
        Node node = first;
//        遍历集合
        do {
//           判断当前元素是否是需要删除的元素
            if (node.e.equals(e)) {
//                删除元素
                node.pre.next = node.next;
                node.next.pre = node.pre;
                size--;
//                判断删除元素是否为第一个元素
                if (node == first) {
                    first = first.next;
                    first = first.pre;
                }
//                判断是否是最后一个元素
                if (size == 0) {
                    first = null;
                }
                return true;
            }
//            继续看下一个
            node = node.next;
        } while (node != first);
        return false;
    }

    int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
//        获取当前节点（从第一个节点开始）
        if (first == null) {
            return "[]";
        }
        Node node = first;
//        遍历集合获取元素
        do {
//            连接元素
            sb.append(node.e);
            if (node == first.pre) {
                sb.append("]");
            } else {
                sb.append(", ");
            }
//            获取下一个节点
            node = node.next;
        } while (node != first);
        return sb.toString();
    }

    boolean contains(E e) {
//        获取当前节点（从第一个节点开始）
        Node node = first;
//        遍历集合
        do {
//           判断当前元素是否是等于指定元素
            if (node.e.equals(e)) {
                return true;
            }
//            继续看下一个
            node = node.next;
        } while (node != first);
        return false;
    }


    class Node {
        E e;//节点内元素
        Node pre;//上一个节点
        Node next;//下一个节点
    }
}

public class MyLinkedDemo {
    public static void main(String[] args) {
        MyLinked<String> ml = new MyLinked<>();
        ml.add("hello");
        ml.add("world");
        ml.add("java");
        ml.remove("java");
        ml.remove("hello");
        ml.remove("world");
        System.out.println(ml);

    }
}
