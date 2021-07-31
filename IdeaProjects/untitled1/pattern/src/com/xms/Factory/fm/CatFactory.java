package com.xms.Factory.fm;

/**
 * @author dpc
 * @create 2021-06-23 上午 10:42
 * 具体工厂类
 */
public class CatFactory extends AnimalFactory{
    @Override
    public Cat crateAnimal() {
        return  new Cat();
    }

}
