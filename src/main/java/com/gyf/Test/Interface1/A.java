package com.gyf.Test.Interface1;

/**
 * @author xiaoyu
 * @date 2021/04/29 09:10:46
 */
interface Gender{
    String FEMALE = "女";
    String MALE = "男";
}
interface  WeekDays{
    String MONDAY = "星期一";
    String TUESDAY = "星期二";
}
public interface A {
    //静态常量 一定要初始化值
    int AGE = 12;
    float PI = 3.14159f;

    //抽象方法
     void add();
}
interface B{

}
interface C extends A,B{

}

class E implements C,B{
    public void add(){

    }
}
class test1{
    public static void main(String[] args) {
        System.out.println(A.PI);
    }
}
