import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dpc
 * @create 2021-06-22 下午 4:51
 * 自定义注解的组成
 */
//当前MyAnno可以作用在类和方法上面
//    如若属性名为value,value可以省略;如果说数组里面只要1个元素,{}可以省略
@Target({ElementType.TYPE,ElementType.METHOD})
//当前MyAnno可以保留到程序运行的时候.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
//    属性列表(实际上就是抽象方法,属性名为抽象方法名,属性值为该方法重写后的返回值)
//    注意返回值类型为基本类型,String,枚举类,注解类,以上类型数组.
//    1)基本类型
    int age() default 18;

//    2)String
    String name();

//    3)枚举
    MyMath mm();

//    4)注解
    Anno anno();

//    5)以上类型数组
    String[] values();
/*
    int[] ids();
    MyMath[] mms();
    Anno[] annos();
*/

//    6)其他类不可以
//    Integer it();

}
