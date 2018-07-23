package com.mysiga.learn.threadpool;

import java.util.concurrent.*;

/**
 * Created by Wilson on 2018/7/10.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 11; i++) {
            executorService.execute(new TestRunnable(String.valueOf(i)));
        }
    }
}
