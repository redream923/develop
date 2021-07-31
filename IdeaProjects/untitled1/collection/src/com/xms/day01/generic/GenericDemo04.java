package com.xms.day01.generic;

/**
 * @author dpc
 * @create 2021-06-11 下午 4:35
 *  泛型方法
 *  public  返回值类型<泛型类型> 方法名（参数列表）{}
 */
class Doo{
    public <T> T  get(T t){
        return t;
    }
}
public class GenericDemo04 {
    public static void main(String[] args) {
        Doo doo=new Doo();
//        调用方法的时候，明确泛型的类型
        System.out.println(doo.get("hello"));
        System.out.println(doo.get(123));
    }

}
