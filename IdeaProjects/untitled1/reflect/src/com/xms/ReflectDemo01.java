package com.xms;

/**
 * @author dpc
 * @create 2021-06-23 下午 4:45
 * 获取calss实例的方式
 */
public class ReflectDemo01 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //    1)Object类中提供的getClass
        Student s = new Student("张三", 11);
        Class<? extends Student> clazz1 = s.getClass();

//        2)类名.class
        Class<Student> clazz2 = Student.class;

//        3)Class.forName(classPath)(推荐使用)
        Class<?> clazz3 = Class.forName("com.xms.Student");

//        4)通过类加载器.loadClass(classPath)
//        获取类加载器
        ClassLoader classLoader = ReflectDemo01.class.getClassLoader();
//        加载类
        Class<?> clazz4 = classLoader.loadClass("com.xms.Student");

        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz2);//t
        System.out.println(clazz1 == clazz3);//t
        System.out.println(clazz1 == clazz4);//t

//        通过class创建对象
//        通过无参构造创建对象
        Student student = clazz1.newInstance();
        System.out.println(student);


    }


}
