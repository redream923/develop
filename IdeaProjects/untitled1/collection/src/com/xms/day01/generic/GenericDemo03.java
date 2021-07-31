package com.xms.day01.generic;

/**
 * @author dpc
 * @create 2021-06-11 下午 4:22
 * 泛型接口
 * interface 接口名<泛型类型1，泛型类型2>{}
 */
interface Inter<T>{
    void  show(T t);
}

//接口是现类(知道是现什么泛型)
class InterImpli1 implements Inter<String>{

    @Override
    public void  show(String s) {
        System.out.println(s);
    }
}

//接口是现类2(不知道是现什么泛型)
class InterImpli2<T> implements Inter<T>{

    @Override
    public void  show(T t) {
        System.out.println(t);
    }
}

public class GenericDemo03 {
    public static void main(String[] args) {
//        是现方式1
        InterImpli1 ii1=new InterImpli1();
        ii1.show("hello");

        Inter ii2=new InterImpli1();
        ii2.show("java");

//        是现方式2
        Inter<String> i1=new InterImpli2<>();
        Inter<Integer> i2=new InterImpli2<>();
        i1.show("zs");
        i2.show(11);
    }
}
