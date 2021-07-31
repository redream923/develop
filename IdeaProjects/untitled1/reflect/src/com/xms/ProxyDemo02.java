package com.xms;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dpc
 * @create 2021-06-24 上午 11:56
 * 动态代理
 * 不需要定义代理类,可以通过Proxy.newProxyInstance()动态的创建代理对象
 * 好处:可以根据不同的需求给出不同的代理对象
 */
interface Deal{
    void sale(double money);
}

class Fd implements Deal{
    @Override
    public void sale(double money) {
        System.out.println("房东报价"+money);
    }
}
public class ProxyDemo02 {
    public static void main(String[] args) {
//        创建一个代理对象
        /*    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
              loader:类加载器
              interfaces:真实类实现的接口
              h:代理对象的操作
              */
        ClassLoader classLoader = ProxyDemo02.class.getClassLoader();
        Class<Fd> fdClass = Fd.class;
        Class<?>[] interfaces = fdClass.getInterfaces();
        Deal proxy =(Deal) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            /*
             * proxy:当前的代理对象
             * method:代理的真实对象的方法
             * args:代理的方法的形参
             * invoke:代理对象代理真实对象的方法,并增增强该方法
             */
            @Override

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                增强真实对象的方
                System.out.println("中介将房源挂到网上");
//                执行真实对象的方法
                return method.invoke(fdClass.newInstance(), args);

            }
        });
        proxy.sale(100);
    }
}
