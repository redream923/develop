package com.xms.decorate;

/**
 * @author dpc
 * @create 2021-06-23 下午 2:42
 */
public class GameDecorate extends PhoneDecorate {
    public GameDecorate(Phone phone) {
        super(phone);
    }

    @Override
    public void function() {
        super.function();
        System.out.println("玩游戏");
    }
}
