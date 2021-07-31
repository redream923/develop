package com.xms.Factory.fm;

/**
 * @author dpc
 * @create 2021-06-23 上午 10:42
 * 具体工厂类
 */
public class DogFactory extends AnimalFactory{
    @Override
    public Dog crateAnimal() {
        return  new Dog();
    }
}
