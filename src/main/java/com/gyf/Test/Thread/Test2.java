package com.gyf.Test.Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyu
 * @date 2021/04/02 15:57:23
 */
public class Test2 {
    public static void main(String[] args) {
        List<Students> s = new ArrayList<Students>();
        s.add(new Students("d",1));
        s.add(new Students("ds",2));
        s.add(new Students("gr",3));

        Students [] arr = {
                new Students("zhangsan",28),
                new Students("list",29),
                new Students("wangwu",30)
        };

        for (Students df:arr) {
            System.out.println(df);
        }
        for (Students df:s) {
            System.out.println(df);
        }
        //arr.forEach(t -> { System.out.println();});
        s.forEach(System.out::println);
    }
}
