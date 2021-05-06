package com.gyf.Test.Thread;

/**
 * @author xiaoyu
 * @date 2021/04/07 15:49:55
 */
public class LockTestByRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("我的线程：正在执行！"+i);

        }
    }

    public static void main(String[] args) {
        //创建线程执行目标类对象

        Runnable runn = new LockTestByRunnable();

//将Runnable接口的子类对象作为参数传递给Thread类的构造函数

        Thread thread = new Thread(runn);

        Thread thread2 = new Thread(runn);

//开启线程

        thread.start();

        thread2.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("main线程：正在执行！"+i);

        }

    }

}
