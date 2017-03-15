package com.mysiga.learn.enums;

/**
 * Created by Wilson on 2017/3/15.
 */

public enum TypeEnum {
    MAN("man"),
    WOMAN("woman");

    private String type;

    TypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
