package com.xms.Factory.sf;

/**
 * @author dpc
 * @create 2021-06-23 上午 10:10
 */
public class AnimalTest {
//    之前方式:直接在客户端创建对象
    Cat cat = new Cat("小花",1);
    Dog dog = new Dog("小黑",2);

//    现在方式:由工厂类创建需要的对象.然后通过工厂类获取对象
    Cat c2 = AnimalFactory.createCat();
    Dog d2 = AnimalFactory.createDog("旺财");
}
