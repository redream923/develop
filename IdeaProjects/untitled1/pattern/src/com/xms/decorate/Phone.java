package com.xms.decorate;

/**
 * @author dpc
 * @create 2021-06-23 下午 2:18
 * 装饰设计模式
 *      继承的替换方案,可以灵活的对对象的功能进行扩展,且可以对这些功能进行随意组合
 * 弊端:随意组合的功能可能会带来逻辑上的不合理
 */
public interface Phone {
    void function();

}
