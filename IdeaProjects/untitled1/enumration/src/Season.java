/**
 * @author dpc
 * @create 2021-06-22 下午 2:12
 * 枚举类
 *  有些类实例个数固定,且实例也是固定的.这时候这个类可以写成枚举类
 */
//季节类
public class Season {
//    实例不可变,成员变量需要写成常量
    private final String SEASON_NAME ;
    private final String SEASON_DESC ;

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }

    public Season(String SEASON_NAME, String SEASON_DESC) {
        this.SEASON_NAME = SEASON_NAME;
        this.SEASON_DESC = SEASON_DESC;
    }


    //    构造私有


//    只能在当前类中提供该类的所有实例,共外界访问
//    实例不可变,引用不可变
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋风瑟瑟");
    public static final Season WINTER = new Season("冬天","白雪纷纷");

    @Override
    public String toString() {
        return "Season{" +
                "SEASON_NAME='" + SEASON_NAME + '\'' +
                ", SEASON_DESC='" + SEASON_DESC + '\'' +
                '}';
    }
}

