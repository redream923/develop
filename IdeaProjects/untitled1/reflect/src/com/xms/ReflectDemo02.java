package com.xms;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author dpc
 * @create 2021-06-23 下午 5:53
 * 获取构造器
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("com.xms.Student");

//        获取所有公共的构造器
        Constructor<?>[] cons = clazz.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }
        System.out.println("-------------");

//        获取所有公共的构造器(包含私有构造)
        Constructor<?>[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }
        System.out.println("-------------");

//        获取公共的单个构造
//        获取2个参数构造
        Constructor<?> con1 = clazz.getConstructor(String.class, int.class);
        System.out.println(con1);
        System.out.println("-------------");

//        获取任意的单个构造器
        Constructor<?> con2 = clazz.getDeclaredConstructor();//无参构造
        System.out.println(con2);

//        通过构造器实例化
        Student s1 = (Student) con1.newInstance("张三", 11);
        System.out.println(s1);

//        取消Java语言检查机制,使得外界可以访问私有成员.
        con2.setAccessible(true);
        Student s2 = (Student) con2.newInstance();
        System.out.println(s2);


    }
}
