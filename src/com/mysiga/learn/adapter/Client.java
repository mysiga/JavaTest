package com.mysiga.learn.adapter;

/**
 * Created by Wilson on 2018/8/8.
 */
public class Client {
    public static void main(String[] args) {
        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96};
        ScoreOperation scoreOperation = new OperationAdapter();
        scoreOperation.sort(scores);
        System.out.println(Client.toString(scores));
        System.out.println(scoreOperation.search(scores,91));
    }

    public static String toString(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(",");
        }
        return builder.toString();
    }
}
