package com.mysiga.learn.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wilson on 2017/3/28.
 */
public class CallTask implements Callable {
    private int upperBounds;

    public CallTask(int upperBounds) {
        this.upperBounds = upperBounds;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= upperBounds; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        try {
            int sum = (int) service.submit(new CallTask((int) (Math.random() * 100))).get();
            System.out.println("sum==" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
