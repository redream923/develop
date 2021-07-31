package com.xms.day03;

import java.io.*;

/**
 * @author dpc
 * @create 2021-06-18 上午 11:21
 */
public class StreamDemo04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        demo1();
        demo2();
    }

    //        反序列化
    private static void demo2() throws IOException, ClassNotFoundException {
//        反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io\\iofile\\dog.txt"));
//        读对象(将流数据还原城对象)
        Dog dog =(Dog) ois.readObject();


        System.out.println(dog);
    }


    //    序列化:将对象变成流数据(二进制数据)
    private static void demo1() throws IOException {
//        序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io\\iofile\\dog.txt"));
//        创建对象
        Dog d = new Dog("小黑", 1);
        d.owner = new Student("小明");
        d.partner = new Cat("小花",2);

//        序列化
//        注意:对象对应类需要实现Serializable接口,不然会法场NotSerializableException
        oos.writeObject(d);

        oos.close();
    }
}
