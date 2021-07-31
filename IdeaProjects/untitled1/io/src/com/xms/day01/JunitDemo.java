package com.xms.day01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dpc
 * @create 2021-06-16 下午 2:26
 * 注意：
 * 方法上添加@Test注解
 *  1）方法上修饰符必须为public
 *  2）返回值类型必须为void
 *  3）不可以有参数
 */
public class JunitDemo {
    @Before
    public  void init(){
        System.out.println("初始化资源，在@Test前执行，不能单独执行");
    }
    @Test
    public void test1(){
        System.out.println("hello");
    }
    @After
    public void destory(){
        System.out.println("释放资源代码，在@Test后执行，不能单独执行");
    }
}
