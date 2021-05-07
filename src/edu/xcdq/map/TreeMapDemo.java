package edu.xcdq.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer  , String> map = new TreeMap<>(); // <> 钻石语法
        map.put(1 ,"hahaha");  // Entry
        map.put(2 ,"hehe");
        map.put(3 ,"heihei");
        map.put(4 ,"xixixi");

        System.out.println(map);

        for (
                Map.Entry<Integer , String > e : map.entrySet()){
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
        System.out.println();

        System.out.println("firstKey =>" + map.firstKey());
        System.out.println("firstEntry =>" + map.firstEntry());
        System.out.println("lastKey" + map.lastKey());
        System.out.println("lastEntry" + map.lastEntry());
    }

}
