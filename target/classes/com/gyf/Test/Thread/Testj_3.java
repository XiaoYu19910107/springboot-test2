package com.gyf.Test.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiaoyu
 * @date 2021/04/02 17:08:45
 */
public class Testj_3 {
    public static void main(String[] args) {
        /*new Thread() {

            public void run() {

                for (int x = 0; x < 40; x++) {

                    System.out.println(Thread.currentThread().getName()

                            + "...X...." + x);

                }

            }

        }.start();*/

       /* new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 40; x++) {

                    System.out.println(Thread.currentThread().getName()

                            + "...X...." + x);

                }
            }
        }).start();*/


            ExecutorService service = Executors.newFixedThreadPool(2);//创建多线程池
            Runnable r = new ThreadPoolDemo();//创建Runnable目标类
            Thread t = new Thread(r);//创建线程
            t.start();//开启线程
            service.submit(r);//提交线程到线程池
            service.submit(r);//提交线程到线程池
            service.shutdown();//关闭线程

    }
}
