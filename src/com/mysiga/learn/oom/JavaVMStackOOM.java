package com.mysiga.learn.oom;

/**
 * java vm stack oom
 */
public class JavaVMStackOOM {
    public void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
