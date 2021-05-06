package com.gyf.Test.Thread;

/**
 * @author xiaoyu
 * @date 2021/04/01 15:31:23
 */
class OuterClass2{
    private int data1 = 1000;
    private int a = 20;
    private int b = 20;
    private static int c = 30;//静态成员
    private static int d = 40;

    class InnerClass{//实例内部类，类似实例成员方法，依赖于外部类对象
        private int data1 = 10;
        private int data2 = 20;
        //private static int data3 = 30;//实例内部类里不能有静态成员方法，会报错
        private static final int data4 = 30;//编译时确定的立即数
        //private static final int data5 = data1 + 30;
        //static InnerClass in = new  InnerClass();
        public void show2(){
            System.out.println("InnerClass  show2()~~~~");
            System.out.println("data1:"+data1);//是内部类的
            System.out.println("data1:"+this.data1);//也是内部类的
            System.out.println("outer data1:"+OuterClass2.this.data1);//通过这种方法可以访问外部类的数据成员
            System.out.println("b:"+b);//可以访问，c和d也可以
        }

        public InnerClass(){
            System.out.println("InnerClass  init~~~~");
        }
    }
    public OuterClass2(){
        System.out.println("OuterClass()  init~~~~");
    }

    public void show(){
        System.out.println("OuterClass()  show~~~~");
    }
}



