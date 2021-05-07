package edu.xcdq.set;

import java.util.TreeSet;

public class ThreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String > set = new TreeSet<>();
        /*set.add("111");
        set.add("1asd");
        set.add("aaaa");
        set.add("bbbb");
        set.add("222");
        set.add("3333");*/

        set.add("8896");
        set.add("123");
        set.add("法外狂徒张三");
        set.add("弛张正义李四");
        set.add("ABC");
        set.add("azxc");
        for (String s  : set ){
            System.out.println(s + "\t");
        }
    }
}
