package com.xms.test;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author dpc
 * @create 2021-06-29 上午 9:40
 * 1)String="张三丰,22"
 * 将字符串截取获取年龄部分的字符串
 * 将年龄字符串转成int
 * 将上一步获得的年龄+10
 * <p>
 * 2)现有字符串"迪丽热巴,女","古力娜扎,女","张三丰,男"
 * 按照姓名:xx,性别xx格式将上面的字符串信息输出.
 * <p>
 * 3)现有一数组,其中还有多个"姓名+性别信息"(比如迪丽热巴,女","古力娜扎,女","张三丰,男","赵敏")
 * 将符合下面要求的元素放入到ArrayList中
 * 1)必须为女生  2)名字必须4个字
 * <p>
 * 4)现有2个List集合存储了多个成员的姓名
 * 要求:
 * 1.第一个集合只要3个字的姓名,并且只要3个
 * 2.第二个集合要姓张的姓名,且不要前两个
 * 3.将2个集合合并为1个集合 Stream.concat(stream1,stream2)
 * 4.通过集合汇总的名称创建person对象,存储到一个新的集合中
 * 5.打印所有的Person信息
 * <p>
 * 5)给定1个数组列表,返回一个由每个数字的平方构成的列表
 * 比如[1,2,3,4,5]返回[1,4,9,16,25]
 * <p>
 * 6)使用map和reduce方法获取流中处理元素的总数
 * <p>
 * 7)现有Trader类和Transaction类
 * class Trader{//交易员
 * private String name;
 * private String city;
 * //构造,getters,setters,toString
 * }
 * class Transaction{//交易
 * private Trader trader;
 * private int year;
 * private int value;
 * //构造,getters,setters,toString
 * }
 * 需求:
 * 1.找处2018年发生的所有交易,并按照交易额升序排序
 * 2.交易员都在哪些城市工作过
 * 3.查找来自上海的交易员,按照名字的字典顺序排序
 * 4.返回所有交易员的姓名,照姓名的字典顺序排序
 * 5.有没有交易员在苏州工作
 * 6.打印所有在上海的交易员的所有交易总额
 * 7.所有交易中,最高的交易额是多少
 * 8找到交易额最小的交易
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "张三丰,22";
        Integer age = fun(
                s -> s.split(",")[1],
                s -> Integer.parseInt(s),
                a -> a + 10, str);
        System.out.println(age);

//        2)现有字符串"迪丽热巴,女","古力娜扎,女","张三丰,男"
// * 按照姓名:xx,性别xx格式将上面的字符串信息输出.
        String[] ss = {"迪丽热巴,女","古力娜扎,女","张三丰,男"};

        fun2((a)->{
            for(String a1:a){
            String[] split0 = a1.split(",");
            System.out.print("姓名:"+split0[0]);
            System.out.println("性别:" +split0[1]);
        }},ss);

//        3)现有一数组,其中还有多个"姓名+性别信息"(比如迪丽热巴,女","古力娜扎,女","张三丰,男","赵敏")
//                * 将符合下面要求的元素放入到ArrayList中
//                * 1)必须为女生  2)名字必须4个字
        String[] arr={"迪丽热巴,女","古力娜扎,女","张三丰,男"};


    }



    public static Integer fun(Function<String, String> one,
                              Function<String,Integer> two,
                              Function<Integer,Integer> three,
                              String s) {
        return one.andThen(two).andThen(three).apply(s);
    }
    public static void fun2(Consumer<String[]> func, String[] s){
         func.accept(s);
    }
}
