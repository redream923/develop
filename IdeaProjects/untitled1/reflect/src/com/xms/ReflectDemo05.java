package com.xms;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-24 上午 11:14
 */
class Fu<T>{}
class Zi extends Fu<String>{}
class Zi2<T> extends Fu<T>{}

interface Inter1{}
interface Inter2{}
class Foo implements Inter1,Inter2{ }

public class ReflectDemo05 {
    public static void main(String[] args) throws ClassNotFoundException {
        //        获取Class
        Class<?> clazz = Class.forName("com.xms.Student");

//        1)获取父类
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass);

//        2)获取泛型父类
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);

//        获取Zi类继承的父类定义的泛型类型
        Class<Zi> ziClass = Zi.class;
        Type type = ziClass.getGenericSuperclass();//带泛型的父类
//        泛型父类转成参数化类型
        ParameterizedType pt = (ParameterizedType) type;
//        获取泛型定义的类型
        Type[] types = pt.getActualTypeArguments();
        System.out.println(type);

//        3)获取所有实现的接口
        Class<Foo> fooClass = Foo.class;
        Class<?>[] interfaces = fooClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces));

//        4)获取所在的包
        Package aPackage = fooClass.getPackage();
        System.out.println(aPackage);
    }
}
