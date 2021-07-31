/**
 * @author dpc
 * @create 2021-06-22 下午 2:45
 * 枚举类实现方式1
 */
public enum SeasonEnumImpl implements Inter {
//    实现方式2
    SPRING("春天","春暖花开"){
    @Override
    public void showInfo() {
        System.out.println("春天来了");
    }
},
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void showInfo() {
            System.out.println("夏天来了");
        }
    },
    AUTUMN("秋天","秋风瑟瑟"){
        @Override
        public void showInfo() {
            System.out.println("秋天来了");
        }
    },
    WINTER("冬天","白雪纷纷"){
        @Override
        public void showInfo() {
            System.out.println("冬天来了");
        }
    };
    private final String SEASON_NAME ;
    private final String SEASON_DESC ;

    private SeasonEnumImpl(String SEASON_NAME, String SEASON_DESC) {
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

//    实现方式1
/*    @Override
    public void showInfo() {
        switch (this){
            case SPRING:
                System.out.println("春天来了");
            case SUMMER:
                System.out.println("夏天来了");
            case AUTUMN:
                System.out.println("秋天来了");
            case WINTER:
                System.out.println("冬天来了");
        }
    }*/
}
