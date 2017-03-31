package com.mysiga.learn.threads;

/**
 * Created by Wilson on 2017/3/28.
 */
public class SleepInterrupt extends Object implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("in run() - about to sleep for 20 seconds");
            Thread.sleep(20000);
            System.out.println("in run() - woke up");
        } catch (InterruptedException e) {
            System.out.println("in run() - interrupted while sleeping");
            //处理完中断异常后，返回到run()方法入口
            //如果没有return,线程不会实际被中断，它会继续打印下面的信息
            return;
        }
        System.out.println("in run() - leaving normally");
    }

    public static void main(String[] args) {
        SleepInterrupt si = new SleepInterrupt();
        Thread t = new Thread(si);
        t.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in main() - interrupting other thread");
        //中断线程t
        t.interrupt();
        System.out.println("in main() - leaving");
    }
}
