/**
 * @author dpc
 * @create 2021-07-17 下午 2:13
 * //写一个类MyLinked，实现双向循环链表的操作
 */
class Node<E>{
    E e ;
    Node pre;
    Node next;
}

class MyLinked<E> {
    Node node;//当前节点
    Node first;//第一个节点
    int size;//集合长度

    boolean  add(E e){
        node =  new Node();
        node.e = e;
        //判断第一个节点是否为空
        if(first == null ){
            node.next = node;
            node.pre = node;
            first = node;
        }else {
            first.pre.next=node;
            node.pre=first.pre;
            node.next=first;
            first.pre= node;
        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(first == null){
            return "[]";
        }else {
            node=first;
            do{
                if(node == first){
                    sb.append("["+node.e);
                }else if(node.next == first) {
                    sb.append(node.e+"]");
                }
                node = node.next;
            }while (node!=first);
        }
        return sb.toString() ;
    }

}
public class MyLinkedDemo {
    public static void main(String[] args) {
        MyLinked<String> ml = new MyLinked<>();
        ml.add("world");
        ml.add("hello");
        ml.add("world");
        ml.add("world");
        ml.add("java");
        ml.add("java");
        ml.add("java");
        ml.add("world");
        System.out.println(ml);
    }

}