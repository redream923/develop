package com.xms.Factory.fm;


/**
 * @author dpc
 * @create 2021-06-23 上午 10:10
 */
public class AnimalTest {


    public static void main(String[] args) {
        //    之前方式:直接在客户端创建对象
        Cat cat = new Cat("小花",1);
        Dog dog = new Dog("小黑",2);

//    现在方式:由具体工厂类创建需要的对象.然后通过工厂类获取对象
        AnimalFactory af1 = new CatFactory();
        Cat c2 = (Cat) af1.crateAnimal();
        AnimalFactory af2 = new DogFactory();
        Dog d2 = (Dog) af2.crateAnimal();

        System.out.println(c2);
        System.out.println(d2);
    }



}
