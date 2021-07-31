package com.xms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**2
 * @author dpc
 * @create 2021-06-24 上午 11:37
 * 通过反射和注解实现自动化测试
 */
public class CalculateType {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException {
//        获取Calculate类
        Class<Calculate> clazz = Calculate.class;
//        实例化
        Calculate cal = clazz.newInstance();
        
//        获取Calculate所有方法
        final Method[] methods = clazz.getDeclaredMethods();

        int count = 0;
//        遍历methods
        BufferedWriter bw =new BufferedWriter(new FileWriter("io\\iofile\\bug.txt"));
        for (Method method :methods){
//            判断当前方法上是否添加了@check
            if(method.isAnnotationPresent(Check.class)){
//               调用该方法
                try {
                    method.invoke(cal);
                } catch (InvocationTargetException e) {
                    count++;
//                    将异常信息写出到日志中
//                    1)创建输出流
//                    2)将异常写出
                    bw.write(method.getName()+"方法发成了异常");
                    bw.newLine();
                    bw.write("异常名"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因:"+e.getCause().getClass());
                    bw.newLine();
                }
            }
        }
        bw.write("一共发生了"+count+"个异常");
        bw.newLine();
        bw.close();
    }
}
