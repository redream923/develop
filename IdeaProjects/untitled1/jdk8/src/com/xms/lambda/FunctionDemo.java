package com.xms.lambda;

import java.util.function.Function;

/**
 * Function<T,R>
 * R apply(T t)
 * <p>
 * andTen(Function fun):先执行一次apply操作，然后将操作的结果作为参数又执行了一次apply操作
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Integer i = fun1(s -> Integer.parseInt(s), "123");
        System.out.println(i);

        //先将字符串转成int,然后+5
        Integer i2 = fun1(s -> {
            int a = Integer.parseInt(s);
            return a + 5;
        }, "123");
        System.out.println(i2);


        Integer i3 = fun2(s -> Integer.parseInt(s), a -> a + 5, "100");
        System.out.println(i3);

        Integer i4 = fun3(a -> Integer.parseInt(a), b -> b + 5, "100");
        System.out.println(i4);
    }



    //字符串转成int

    public static Integer fun1(Function<String, Integer> func, String s) {
        return func.apply(s);
    }
    //执行2个apply

    public static Integer fun2(Function<String, Integer> one,
                               Function<Integer, Integer> two, String s) {
        return one.andThen(two).apply(s);
    }
    //先将字符串转成int,然后+5

    private static Integer fun3(Function<String, Integer> one, Function<Integer, Integer> two, String s) {
        return two.compose(one).apply(s);
    }


}
