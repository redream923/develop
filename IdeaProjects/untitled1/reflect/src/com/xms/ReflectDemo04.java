package com.xms;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-24 上午 10:11
 * 获取并使用成员方法
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        获取Class
        Class<?> clazz = Class.forName("com.xms.Student");
        
//        获取成员方法
//        1)获取当前类和父类中所有的公共的成员方法
        Method[] methods1 = clazz.getMethods();
        for(Method method : methods1){
            System.out.println(method);
        }
        System.out.println("------------");


//        2)获取当前类中所有的成员方法
        Method[] methods2 = clazz.getDeclaredMethods();
        for( Method method :methods2){
            System.out.println(method);
        }
        System.out.println("------------");
//        3)获取单个公共的员方法
        Method show1 = clazz.getMethod("show");
        System.out.println(show1);
        System.out.println("-------------");
//        4)获取任意单个的成员方法
        Method show2 = clazz.getDeclaredMethod("show", String.class);
        System.out.println(show2);
        System.out.println("-------------");

//        成员变量的使用
        Constructor<?> con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        Student s = (Student) con.newInstance();
//        成员变量的使用
//
//        1)调用方法
        show1.invoke(s);
        show2.setAccessible(true);
        show2.invoke(s,"java");
//       获取方法名
        System.out.println(show2.getName());//"show"
//        获取修饰符
        System.out.println(Modifier.toString(show2.getModifiers()));//"private"
//        获取返回值类型
        System.out.println(show2.getReturnType());
//        获取形参类型
        Class<?>[] parameterTypes = show2.getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes));
//        获取异常类型
        Class<?>[] exceptionTypes = show2.getExceptionTypes();
        System.out.println(Arrays.toString(exceptionTypes));
//        获取注解
//        7.1获取所有注解
        Annotation[] annos = show2.getAnnotations();
        System.out.println(Arrays.toString(annos));
//        7.2获取指定的单个注解
        MyAnno ma = show2.getAnnotation(MyAnno.class);
        System.out.println(ma);

    }
}
