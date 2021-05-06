package com.gyf.Test.Thread;

/**
 * @author xiaoyu
 * @date 2021/04/02 17:23:58
 */
public class Actor extends Thread{
    public void run(){
        System.out.println(getName()+"是一个演员");
        int count = 0;
        boolean keepRunning = true;
        int sleep = 0;
        while (keepRunning){

            System.out.println(getName()+"登台演出："+(++count));
            if(count%10 == 0){
                try {
                    /*if(count==0){
                        System.out.println("先休息了3秒");
                    }*/
                    sleep++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (count == 100){
                keepRunning = false;
            }
        }
        System.out.println("一共休息了"+sleep+"次");
        System.out.println(getName()+"演出结束了！");
    }

    public static void main(String[] args) {
        Thread actor = new Actor();
        actor.setName("Mr.Thread");
        actor.start();

        Thread s = new Thread(new ArmyRunnable(),"Ms.Runnable");
        s.start();
    }
}
