package com.mysiga.learn.throwable;

/**
 * Created by Wilson on 2018/7/16.
 */
public class CustomError extends Error {
    public CustomError() {
    }

    public CustomError(String message) {
        super(message);
    }

    public CustomError(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomError(Throwable cause) {
        super(cause);
    }

    public CustomError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
