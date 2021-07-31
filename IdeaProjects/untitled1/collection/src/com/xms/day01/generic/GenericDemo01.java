package com.xms.day01.generic;

/**
 * @author dpc
 * @create 2021-06-11 下午 3:55
 * 泛型的由来：在没有泛型的时候，用Object表示任意的引用类型，但是当我们需要进行向下转型的时候，可能会发生ClassCastException
 *
 *
 */
class ObjectDemo {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

public class GenericDemo01 {
    public static void main(String[] args) {
        ObjectDemo od = new ObjectDemo();
        od.setObj("张三");
        String name = (String) od.getObj();
        System.out.println(name);

        od.setObj(11);
        String s = (String) od.getObj();
        System.out.println(s);
    }
}
