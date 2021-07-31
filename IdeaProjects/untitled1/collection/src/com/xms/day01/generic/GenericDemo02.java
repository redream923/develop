package com.xms.day01.generic;

/**
 * @author dpc
 * @create 2021-06-11 下午 4:12
 * 泛型类
 * class 类名<泛型类型1，泛型类型2>{}
 */
class Foo<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class GenericDemo02 {
    public static void main(String[] args) {
//     创建对象的时候，声明泛型的类型
        Foo<String> foo = new Foo<String>();
        foo.setT("zs");
        String name = foo.getT();
        System.out.println(name);

//        从JDK1.7，后面<>中的泛型不需要写。
        Foo<Integer> foo2 = new Foo<>();
        foo2.setT(11);
        int age = foo2.getT();
        System.out.println(age);
    }
    

}
