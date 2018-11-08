package com.mysiga.learn.exception;

/**
 * Created by Wilson on 2018/10/23.
 */
public class CException extends BException {

    public CException() {
    }

    /**
     *    //非静态方法1，对象锁
     */
    public synchronized void method1(CException ce) {
        for (int i = 0; i < 5; i++) {
            System.out.println("method1 is running!");

            System.out.println(ce);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * 代码块方法，类锁
     * @param ce
     */
    public void method3(CException ce) {
        synchronized (CException.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println("method3 is running!");

                System.out.println(ce);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * //静态方法2，类锁
     */
    public static synchronized void method2(CException ce) {
        for (int i = 0; i < 5; i++) {
            System.out.println("method2 is running!");
            System.out.println(ce);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    @Override
    public BException get(BException b) throws Exception {
        return super.get(b);
    }

    public static void main(String[] args) {
        CException cException = new CException();
        CException ccException = new CException();
        new Thread() {
            @Override
            public void run() {
                super.run();
                cException.method3(cException);

            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                ccException.method3(ccException);
            }
        }.start();
    }
}
