import org.junit.Test;

/**
 * @author dpc
 * @create 2021-06-22 下午 2:21
 */
public class SeasonTest {
    //    自定义枚举类
    @Test
    public void test1() {
//        Season
        Season spring = Season.SPRING;
        System.out.println(spring);
//        spring.setName("春春");
//        System.out.println(spring);

    }

    //    Java提供的枚举类
    @Test
    public void test2() {
        SeasonEnum spring = SeasonEnum.SPRING;
        System.out.println(spring);
        System.out.println("---------------");


//        values():获取所有的枚举对象
        SeasonEnum[] values = SeasonEnum.values();
        for (SeasonEnum value : values) {
            System.out.println(value);
        }
        System.out.println("---------------");

//        static valueOf(name):通过指定的字符串获取对应的枚举对象
//        对象名必须要和枚举对象一致
        SeasonEnum winter = SeasonEnum.valueOf("WINTER");
        System.out.println(winter);


    }

    //    枚举类实现接口
    @Test
    public void test3() {
        SeasonEnumImpl spring = SeasonEnumImpl.SPRING;
        spring.showInfo();
    }

}
