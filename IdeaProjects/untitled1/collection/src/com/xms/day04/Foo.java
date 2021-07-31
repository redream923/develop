package com.xms.day04;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author dpc
 * @create 2021-06-19 下午 3:05
 */

public class Foo {
    int value;

    Foo(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Foo) {
            Foo foo = (Foo) o;
            return value == foo.value;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        HashSet set = new HashSet();
        list.add(new Foo(1));
        set.add(new Foo(1));
        System.out.println(new Foo(1).equals(new Foo(1))+","+list.contains(new Foo(1)));

    }
}
