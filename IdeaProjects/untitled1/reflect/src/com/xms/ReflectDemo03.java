package com.xms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author dpc
 * @create 2021-06-24 上午 9:38
 * 成员变量
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        获取Class
        Class<?> clazz = Class.forName("com.xms.Student");

//        成员变量的获取
//        1)获取所有公共成员变量
        Field[] fields1 = clazz.getFields();
        for(Field field : fields1){
            System.out.println(field);
        }
        System.out.println("--------------");

//        获取所有的成员变量
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field field : fields2){
            System.out.println(field);
        }
        System.out.println("--------------");

//        获取单个公共的成员变量
        Field gender = clazz.getField("gender");
        System.out.println(gender);
        System.out.println("---------------");

//        获取任意单个成员变量
        Field nameField = clazz.getDeclaredField("name");
        System.out.println(nameField);
        System.out.println("---------------");

//        通过无参构造实例化
        Constructor<?> con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        Student s = (Student) con.newInstance();

//        成员变量的使用
//        1)设置成员变量的值()需要对象
        gender.set(s,'男');
        nameField.setAccessible(true);
        nameField.set(s,"张三");
//        2)获取成员变量的值(需要对象)
        System.out.println(gender.get(s));
        System.out.println(nameField.get(s));

//        3)获取成员变量名
        System.out.println(nameField.getName());

//        4)获取成员变量的类型
        System.out.println(nameField.getType());

//        5)获取成员变量的修饰符
        int modifiers = nameField.getModifiers();

//        通过Modifier对modifiers进行解码,获取字符串格式的修饰符
        System.out.println(Modifier.toString(modifiers));


    }
}
