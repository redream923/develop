package com.xms.lambda;

/**
 * @author dpc
 * @create 2021-06-25 下午 2:39
 * 函数式接口
 * 抽象方法有且仅有1个
 * <p>
 * 面向对象思想:强调必须要通过对象的形式来做事
 * 函数式变成思想:强调做什么,而不是以什么形式去做
 * Lambda
 * 格式
 * (参数列表) -> {代码语句};
 * 说明:
 * Lambda是函数式接口的某个匿名实现类对象
 * ()里面的参数表示的是函数式接口中抽象方法的参数
 * ->被用于
 * {}:对函数式接口类抽象方法的重写
 * <p>
 * 省略规则
 * Lambda体现函数式变成思想,所以凡是通过上下文推到出来的所有东西通通可以省略
 * 1)小括号中的参数类型可以省略
 * 2)如果小阔号中只有一个参数,()可以省略
 * 3)若果{}中只有一句话,可以省略{}和;如果是return语句,return也可以省略
 */

@FunctionalInterface
interface Inter {
    void show(int a);

    default void add() {
    }

    static void fun() {
    }
}

public class lambdaDemo01 {
    public static void main(String[] args) {
//        通过匿名内部类提供Inter的实现类对象
        Inter i1 = new Inter() {
            @Override
            public void show(int a) {
                System.out.println(a);
            }
        };
        i1.show(10);

//        通过Lambda提供Inter的实现类对象
        Inter i2 = (a) -> {
            System.out.println(a);
        };
        i2.show(100);

//        优化Lambda
        Inter i3 = a-> System.out.println(a);
        i3.show(200);
    }
}
