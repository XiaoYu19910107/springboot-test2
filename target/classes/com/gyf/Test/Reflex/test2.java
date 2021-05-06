package com.gyf.Test.Reflex;

/**
 * @author xiaoyu
 * @date 2021/04/08 16:03:09
 */
public class test2 {
    private int age;
    private String name;
    private int testint;

    public test2() {
    }

    public test2(int age) {
        this.age = age;
    }

    public test2(int age, String name) {
        this.age = age;
        this.name = name;
    }
    private test2(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestint() {
        return testint;
    }

    public void setTestint(int testint) {
        this.testint = testint;
    }

    private void welcome(String tips){
        System.out.println(tips);
    }
}
