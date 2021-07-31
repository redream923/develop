package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 上午 9:49
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
//        属性(其他包装类类似)
        System.out.println(Integer.MAX_VALUE);//int的最大值
        System.out.println(Integer.MIN_VALUE);//int的最小值
        System.out.println(Integer.SIZE);//int的比特位
        System.out.println(Integer.TYPE);//int的class
        System.out.println(int.class);

//        构造
//        1)所有包装类都可以通过基本类型进行包装
        Integer i1 = new Integer(10);
        Character c1 = new Character('a');
        Double d1 = new Double(1.23);

//        2)大部分包装类都可以通过String进行构造
        Integer i2 = new Integer("10");
        Double d2 = new Double("1.23");
//        new Character('a');

//        成员方法:
//        1)intValue():将Integer转成int
//        类似的其他包装类中的xxxValue():将包装类转成其他类型
        int a = i1.intValue();

//        2)static parseInt(String):将字符串转成int
        int a2 = Integer.parseInt("123");
        System.out.println(a2);
//        类似的其他包装类中的parsexxx(String):将字符串转换成对应的基本类型
        double d3 = Double.parseDouble("1.23");
        System.out.println(d3);

//        3)valueOf(int/String):将int/String类型的数据转成Integer类型
        Integer it1 = Integer.valueOf(10);
        Integer it2 = Integer.valueOf("10");
//        类似的其他包装类中static valueOf(参数)：将参数类型转成当前类类型
        Character ch1 = Character.valueOf('a');


    }
}
