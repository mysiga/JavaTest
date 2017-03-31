package com.mysiga.learn.oom;

/**
 * java vm stack sof
 */
public class JavaVMStackSOF {
    private int stackLength;

    private void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Exception e) {
            System.out.println("JavaVMStackSOF stackLength=" + oom.stackLength);
            throw e;
        }
    }
}
