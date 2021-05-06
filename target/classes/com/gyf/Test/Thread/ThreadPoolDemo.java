package com.gyf.Test.Thread;

/**
 * @author xiaoyu
 * @date 2021/04/07 17:54:20
 */
public class ThreadPoolDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("我要一个线程");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("获取线程名："+Thread.currentThread().getName());
        System.out.println("线程任务执行并返回线程池");
    }

}
