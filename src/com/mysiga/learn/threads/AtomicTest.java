package com.mysiga.learn.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Wilson on 2018/8/20.
 */
public class AtomicTest {
    private AtomicInteger atomicInteger = new AtomicInteger();

    public void set(int potion) {
        System.out.println("set1,value=" + atomicInteger.get());
        atomicInteger.set(potion);
        System.out.println("set2,value=" + atomicInteger.get());
    }

    public int get() {
        int potion = atomicInteger.get();
        System.out.println("get,value=" + potion);
        return potion;
    }

    public static void main(String[] args) {
//        AtomicTest atomicTest = new AtomicTest();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("setThread");
//                atomicTest.set(1);
//            }
//        }).start();
//        for (int i = 0; i < 3; i++) {
//            new Thread() {
//                @Override
//                public void run() {
//                    super.run();
//                    System.out.println("getThread");
//                    if (atomicTest.get() >= 1) {
//                        atomicTest.set(atomicTest.get() + 1);
//                    }
//                }
//            }.start();
//        }
//        String aaa="http://schedule_h5.bizwell.cn/";
        String aaa="http://wwww.bizwell.cn/";
        System.out.println(aaa.contains("schedule_h5"));

    }
}
