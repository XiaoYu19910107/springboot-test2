package com.gyf.Test.Thread;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaoyu
 * @date 2021/04/07 10:39:12
 */
public class LockTest {
    private Lock lock = new ReentrantLock(); // ReentrantLock是Lock的子类

    private void method(Thread thread) throws InterruptedException{
        //lock.lock(); // 获取锁对象
        if (lock.tryLock(1, TimeUnit.SECONDS)) {
            try {
                System.out.println("线程名："+thread.getName() + "获得了锁");
                 //Thread.sleep(3000);
            }catch(Exception e){
                e.printStackTrace();
            } finally {
                System.out.println("线程名："+thread.getName() + "释放了锁");
                lock.unlock(); // 释放锁对象
            }
        }
    }
    public static void main(String[] args) {
        final LockTest lockTest = new LockTest();

        // 线程1
        Thread t1 = new Thread(new Runnable() {

            @SneakyThrows
            @Override
            public void run() {
                // Thread.currentThread()  返回当前线程的引用
                lockTest.method(Thread.currentThread());
            }
        }, "t1");

        // 线程2
        Thread t2 = new Thread(new Runnable() {

            @SneakyThrows
            @Override
            public void run() {
                lockTest.method(Thread.currentThread());
            }
        }, "t2");

        t1.run();
        t2.start();
    }

}
