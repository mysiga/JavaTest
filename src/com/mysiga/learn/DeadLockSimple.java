package com.mysiga.learn;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Wilson on 2018/8/15.
 */
public class DeadLockSimple extends Thread {
    private String first;
    private String second;

    public DeadLockSimple(String name, String first, String second) {
        super(name);
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
        super.run();
        synchronized (first) {
            System.out.println(this.getName() + ",obtained1:" + first);

            try {
                Thread.sleep(1000L);
                synchronized (second) {
                    System.out.println(this.getName() + ",obtained2:" + second);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        //死锁检测
        ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
        Runnable dlCheck = new Runnable() {
            @Override
            public void run() {
                long[] threadIds = mxBean.findDeadlockedThreads();
                if (threadIds != null) {
                    ThreadInfo[] threadInfos = mxBean.getThreadInfo(threadIds);
                    System.out.println("Detected deadlock threads:");
                    for (ThreadInfo threadInfo : threadInfos) {
                        System.out.println(threadInfo.getThreadName());
                    }
                }
            }
        };
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(dlCheck,5L,10L, TimeUnit.SECONDS);
        //死锁示例
        String lockA = "lockA";
        String lockB = "lockB";
        DeadLockSimple t1 = new DeadLockSimple("thread1", lockA, lockB);
        DeadLockSimple t2 = new DeadLockSimple("thread2", lockB, lockA);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
