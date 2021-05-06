package com.gyf.Test.Thread;

import java.util.concurrent.Callable;

/**
 * @author xiaoyu
 * @date 2021/04/08 15:06:15
 */
public class MyCallable implements Callable<Integer> {
    //成员变量

    int x = 5;

    int y = 3;

//构造方法

    public MyCallable(){

    }

    public MyCallable(int x, int y){

        this.x = x;

        this.y = y;

    }



    @Override

    public Integer call() throws Exception {

        return x+y;

    }
}
