package com.mysiga.learn.test;

/**
 * Created by Wilson on 2017/8/15.
 */
public class Year {
    private int year;
    private String name;

    public Year(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Year{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final Year year=new Year(1,"2");
        System.out.println(year.toString());
        year.setYear(3);
        System.out.println(year.toString());
    }

}


