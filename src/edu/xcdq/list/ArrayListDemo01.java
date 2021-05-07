package edu.xcdq.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        String [] str = new String[] {"a1" ,"a2" , "a3"};
        str[0] = "111";
        str[1] = "222";
        str[2] = "333";
        //  删除位置为1的元素
        str[1] = str[2];
        str[2] = null ;


        ArrayList<String> list = new ArrayList<>(); // 数组列表 地=底层是数组
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555"); // 增加
        System.out.println(list);
        list.remove(1);  // 删除
        list.remove("444");
        System.out.println(list);
        list.set(2 , "55555"); // 修改
        System.out.println(list);
        // 查询
        for (String l :list ){
            System.out.print(l + "\t ");
        }
        System.out.println();
        for (int i = 0 ; i < list.size(); i ++ ){
            System.out.println( list.get(i)  + "\t");
        }



    }
}
