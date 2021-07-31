package com.xms.Factory.sf;

/**
 * @author dpc
 * @create 2021-06-23 上午 10:18
 * 简单工厂 (静态工厂)
 *      由该工厂类创建所有对象
 * 优点:对象的创建者和调用者进行分离,便与程序维护和扩展
 * 缺点:工厂里面代码量太多,一旦有新的对象需要创建,需要不停的新增代码
 */
public class AnimalFactory {
    public static Cat createCat(){
        return new Cat();
    }
    public static Dog createDog(String name){
        return  new Dog(name,18);
    }

/*    public static Animal createAnimal(String info){
        if("cat".equalsIgnoreCase(info)){
            return new Cat();
        }else if("dog".equalsIgnoreCase(info)){
            return  new Dog();
        }
        return null;
    }*/



}
