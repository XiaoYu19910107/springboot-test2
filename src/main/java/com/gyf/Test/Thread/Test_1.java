package com.gyf.Test.Thread;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author xiaoyu
 * @date 2021/04/02 09:31:52
 */


public class Test_1 {
    public static void main(String[] args) {
        Person [] arr = {
                new Person("zhangsan",48),
                new Person("list",29),
                new Person("wangwu",30)
        };
        int [] arr1 = {4,1,5,3};

        //排序前
        System.out.println("排序前");
        for (int person : arr1) {
            System.out.println(person);
        }
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //排序后
        System.out.println("排序后");
        for (int person : arr1) {
            System.out.println(person);
        }
    }


}

