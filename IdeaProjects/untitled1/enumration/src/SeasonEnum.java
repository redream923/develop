/**
 * @author dpc
 * @create 2021-06-22 下午 2:45
 * java提供的枚举类
 *      注意:枚举对象只能定义在最前面
 */
public enum SeasonEnum {
//    创建枚举对象
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋风瑟瑟"),
    WINTER("冬天","白雪纷纷");
    private final String SEASON_NAME ;
    private final String SEASON_DESC ;

    private SeasonEnum(String SEASON_NAME, String SEASON_DESC) {
        this.SEASON_NAME = SEASON_NAME;
        this.SEASON_DESC = SEASON_DESC;
    }

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "SEASON_NAME='" + SEASON_NAME + '\'' +
                ", SEASON_DESC='" + SEASON_DESC + '\'' +
                '}';
    }
}
