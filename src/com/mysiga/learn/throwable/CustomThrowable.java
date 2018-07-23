package com.mysiga.learn.throwable;

/**
 * Created by Wilson on 2018/7/16.
 */
public class CustomThrowable extends Throwable {
    public CustomThrowable() {
    }

    public CustomThrowable(String message) {
        super(message);
    }

    public CustomThrowable(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomThrowable(Throwable cause) {
        super(cause);
    }

    public CustomThrowable(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
