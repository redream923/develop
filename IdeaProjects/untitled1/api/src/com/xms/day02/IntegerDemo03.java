package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 上午 10:34
 * <p>
 * 若果对Integer变量直接赋值（底层实际调用的是vlaue()）,
 * 如果值在-128~127之间。
 * 如果是第一次赋值，程序会放进一个缓冲区来存储该值。
 * 如果不是第一次赋值，会从缓冲区里面查找是否存在要赋的值，如果有，直接使用缓冲区的值；
 * 如果没有，现在缓冲区内创建该值然后在赋值
 */
public class IntegerDemo03 {
    public static void main(String[] args) {
        Integer it1 = new Integer(127);
        Integer it2 = new Integer(127);
        System.out.println(it1 == it2);//f
        System.out.println(it1.equals(it2));//t


        Integer it3 = new Integer(128);
        Integer it4 = new Integer(128);
        System.out.println(it3 == it4);//f
        System.out.println(it3.equals(it4));//t

        Integer it5 = 127;
        Integer it6 = 127;
        System.out.println(it5 == it6);//true
        System.out.println(it5.equals(it6));//t


        Integer it7 = 128;
        Integer it8 = 128;
        System.out.println(it7 == it8);//f
        System.out.println(it7.equals(it8));//t

    }
}
