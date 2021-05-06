package com.gyf.Test.Reflex;

/**
 * @author xiaoyu
 * @date 2021/04/08 17:22:03
 */
public class Test3 {
    private String name;

    public Test3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            Class cObj  = Class.forName("java.lang.String");
            Class c = String.class;
            Test3 t3 = new Test3("张三");
            Class a = t3.getClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void queryStudent(){
        System.out.println("hello!");

    }
}
