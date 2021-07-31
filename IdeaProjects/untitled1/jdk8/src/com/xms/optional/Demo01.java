package com.xms.optional;

import java.util.Optional;

/**
 * @author dpc
 * @create 2021-06-28 下午 5:35
 * Optional
 * 是一个容器类,可以用来存储一个对象,也可以用来表示1个对象是否存在.
 * 之前我们使用null表示对象不存在,但是会引发NullPointerException
 * 现在使用Optional可以避免NullPointerException
 */
public class Demo01 {
    public static void main(String[] args) {
        String s = "hello";
//        s=null;
//        1)static of(T):通过T获取Optional
        Optional<String> op1 = Optional.of(s);
//        如果s为null,则发生NullPointerException
        System.out.println(op1.get());

//        2)static empty():获取空的Optional
        Optional<Object> op2 = Optional.empty();
//        System.out.println(op2.get());//NoSuchElementException

//        3)static ofNullable(T):通过T获取Optional,如果T为Null,则获取一个空的Optional
        Optional<String> op3 = Optional.ofNullable(s);
        System.out.println(op3.get());
        s = null;
        Optional<String> op4 = Optional.ofNullable(s);
//        4)判断容器内是否有元素
        if (op4.isPresent()) {//有元素
            System.out.println(op4.get());
        } else {
//            5)orElse(T):如果容器有元素,返回容器内元素;如果没有元素,返回T.
            String s2 = op4.orElse("java");
            System.out.println(s2);//"java"

//            6)orElseGet(supplier):如果容器有元素,返回容器内元素;如果没有元素,返回supplier获取的元素
            String s3 = op4.orElseGet(() -> "javaSE");
            System.out.println(s3);

        }

//        7)map:如果容器中没有元素,返回一个空容器
        Optional<String> op5 = op3.map(a -> a.toUpperCase());

        System.out.println(op5.get());
//        8)flatMap
        Optional<String> op6 = op3.flatMap(a -> Optional.ofNullable(a.toUpperCase()));
        System.out.println(op6.get());
    }
}
