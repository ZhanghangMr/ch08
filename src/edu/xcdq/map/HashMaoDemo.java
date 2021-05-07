package edu.xcdq.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMaoDemo {
    public static void main(String[] args) {
        HashMap<Integer  , String> map = new HashMap<>(); // <> 钻石语法
        map.put(1 ,"hahaha");  // Entry
        map.put(2 ,"hehe");
        map.put(3 ,"heihei");
        map.put(4 ,"xixixi");

        System.out.println(map);

        for (Map.Entry<Integer , String > e : map.entrySet()){
            System.out.println(e.getKey() + "= " + e.getValue() + "\t");
        }
        System.out.println();

        for (Integer i : map.keySet() ){
            System.out.println( i + "= "+  map.get(i) + "\t");
        }

        System.out.println();
        for (String v :map.values()){
            System.out.println( v + "\t" );
        }

    }
}
