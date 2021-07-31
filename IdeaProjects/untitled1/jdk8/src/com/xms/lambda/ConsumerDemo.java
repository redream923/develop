package com.xms.lambda;

import java.util.function.Consumer;

/**
Customer<R>
    void accept(R r)
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        shopping(m -> System.out.println("花了"+m+"块钱买了部手机"),3000);

        //将"HeLLo"转成大写输出，再转成小写输出
        fun(s-> System.out.println(s.toUpperCase()),
                s-> System.out.println(s.toLowerCase()),"HeLLo");
    }

    public static void shopping(Consumer<Double> consumer, double money){
          consumer.accept(money);
    }

    //andThen:使用提供的参数执行2次独立操作
    public static void fun(Consumer<String> one,
                           Consumer<String> two, String s){
         one.andThen(two).accept(s);
    }
}
