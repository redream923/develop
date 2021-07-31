package com.xms.optional;

import java.util.Optional;

/**
 * 开发:
 *
 * @author dpc
 * @create 2021-06-28 下午 6:01
 */
class Man {
    Goddess goddess;//女神

    public Man() {
    }

    public Man(Goddess goddess) {
        this.goddess = goddess;
    }

    @Override
    public String toString() {
        return "Man{" +
                "goddess=" + goddess +
                '}';
    }
}

class Goddess {
    String name;

    public Goddess(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goddess{" +
                "name='" + name + '\'' +
                '}';
    }
}

//优化3
class NewMan {
    Optional<Goddess> opGoddess = Optional.empty();

    public NewMan(Optional<Goddess> op) {
        this.opGoddess = op;
    }

    public NewMan() {
    }
}

public class Demo02 {
    public static void main(String[] args) {
//       需求:获取男人心目中的女神名
        Man man = new Man();

//        1)
/*      String goddessName = getGoddessName(man);
        System.out.println(goddessName);
*/
        String goddessName2 = getGoddessName2(man);
        System.out.println(goddessName2);
        NewMan newMan = null;
        String goddessName3 = getGoddessName3(Optional.ofNullable(newMan));
        System.out.println(goddessName3);
    }

    //    方式1
    private static String getGoddessName(Man man) {
        return man.goddess.name;
    }

    //    方式2(改进1)
    private static String getGoddessName2(Man man) {
        if (man != null) {
            Goddess goddess = man.goddess;
            if (goddess != null) {
                return goddess.name;
            }
        }
        return "仓井null";
    }

    //    方式3(使用Optional进行优化)
    private static String getGoddessName3(Optional<NewMan> opMan) {
        return opMan.orElse(new NewMan()).opGoddess.orElse(new Goddess("小明")).name;
    }

    }
