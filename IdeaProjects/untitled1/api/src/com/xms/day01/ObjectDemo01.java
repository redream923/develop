package com.xms.day01;

/**
 * @author dpc
 * @create YEAR−{YEAR}-YEAR−{MONTH}-08 下午 4:56
 */
//需要克隆对象所对应的泪要实现cloneable接口后，才能进行克隆操作，不然会发成CloneNotSupportedException（克隆不支持异常）
class Studnet implements Cloneable {
    String name;
    int age;

//    Alt+Insert

    public Studnet() {
    }

    public Studnet(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int hashCode() {
//        如果两个对象的哈希码值不等，这时候这两个对象一定不等
//        如果两个对象的哈希码值相等，这时候这两个对象不一定相等
//        如果两个对象相等，那么这两个对象的哈希码值一定相等
//        如果两个对象不等，那么这两个对象的哈希码值一定不等
//        一般我们通过哈希码值粗略判断两个对象是否相等

//        如果算法比较简单，出现【两个对下不等，但是两个对象的哈希码值相等】概率会变高
        int n = name.hashCode() * 3;
        return age;


    }


    public boolean equals(Object obj) {
//        判断类型
/*        if(!(obj instanceof Studnet)){
        return  false;
        }*/

//        判断参数是否是null

        if (obj == null) {
            return false;
        }

//      判断地址值
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }
//        向下转型
        Studnet s = (Studnet) obj;
//        判断属性
        return age == s.age && name.equals(s.name);

    }

    @Override
    public String toString() {
        return "name="+name+"age="+age;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectDemo01 {
    public static void main(String[] args) {
        Studnet s1 = new Studnet("张三", 11);
        Studnet s2 = new Studnet("李四", 12);
        Studnet s3 = new Studnet("李四", 12);

//        1)获取运行时类
//        Alt + Enter
        Class c1 = s1.getClass();
        Class c2 = s2.getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);

//        获取对象的哈希吗值（哈希码值可以看成是对象的特征值）
//        默认返回的是对象的地址值信息，不符合我们的要求，所以需要重写
        int h1 = s1.hashCode();
        int h2 = s2.hashCode();
        int h3 = s3.hashCode();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);


//        3)比较两个对象是否相等（对象相等：对象的属性相同）
//        默认比较的是对象的地址值,所以子类需要重写
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

//        4)toString():返回对象的字符串表示，默认返回的是地址信息
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());


//        5)clone():克隆对象，生成一个对象的副本
        try {
            Object clone = s1.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
