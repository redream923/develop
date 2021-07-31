package com.xms.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author dpc
 * @create 2021-06-29 上午 11:48
 * * 4)现有2个List集合存储了多个成员的姓名
 * * 要求:
 * * 1.第一个集合只要3个字的姓名,并且只要3个
 * * 2.第二个集合要姓张的姓名,且不要前两个
 * * 3.将2个集合合并为1个集合 Stream.concat(stream1,stream2)
 * * 4.通过集合汇总的名称创建person对象,存储到一个新的集合中
 * * 5.打印所有的Person信息
 */
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Test04 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("杨过", "小龙女", "周芷若", "张无忌", "赵无极", "逍遥子", "金轮法王");
        List<String> list2 = Arrays.asList("张三丰", "张翠山", "张全蛋", "李小二", "赵灵儿", "李逍遥", "张天爱");
        Stream<String> m1 = list1.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> m2 = list2.stream().filter(s -> s.charAt(0) == '张').skip(2);

        Stream<String> sm = Stream.concat(m1, m2);
        List<Person> list = sm.map(Person::new).collect(Collectors.toList());
        System.out.println(list);
    }
}
