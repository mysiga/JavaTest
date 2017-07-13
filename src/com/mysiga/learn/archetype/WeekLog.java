package com.mysiga.learn.archetype;

/**
 * Created by Wilson on 2017/7/12.
 */
public class WeekLog implements Cloneable {
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public WeekLog clone() {
        try {
            Object object = super.clone();
            return (WeekLog) object;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            e.printStackTrace();
            return null;
        }
    }
}
