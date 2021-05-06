package com.gyf.Test.Reflex;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoyu
 * @date 2021/04/19 15:21:43
 */
class Person implements Serializable {
    private String name;
    private int age;
    private List<Map<String,Object>> list;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<Map<String, Object>> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

    public void getMession(List<Map<String,Object>> list){
        for (Map<String,Object> li : list) {
            System.out.println(li.get(li.keySet()).toString());
        }
    }
    public void info(String prof, int score){
        System.out.println("我的专业"+prof+"入学成绩"+score);
    }
    @Override
    public String toString(){
        return "姓名"+this.name+"年龄"+this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }
}

