package com.gyf.Test.Interface1;

/**
 * @author xiaoyu
 * @date 2021/04/29 15:07:25
 */
interface printable {
    String NAME = "zhangsan";
    void print1();
    void print2();
}
interface AI{
    void init();
}
interface printable2 extends AI{
    void print3();
}

class Printer implements printable2,printable{

    @Override
    public void init() {

    }

    @Override
    public void print3() {
        System.out.println("print3");
    }

    @Override
    public void print1() {

    }

    @Override
    public void print2() {

    }

}
class Person{
    public void update(){
        System.out.println("Person");
    }
}
class Chinese extends Person{
    public void delete(){

    }
    public void update(){
        System.out.println("Chinese");
    }

}
class Test1{
    public static void main(String[] args) {
        String NAME = "lisi";
        printable2 p = new Printer();
        p.print3();
    }
}