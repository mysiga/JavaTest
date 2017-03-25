package com.mysiga.learn.builder;

/**
 * Created by Wilson on 2017/3/25.
 */
public class Person {
    private String name;
    private String year;
    private int hight;

    @Override
    public String toString() {
        return "Compture{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", hight=" + hight +
                '}';
    }

    public Person(String name, String year, int hight) {
        this.name = name;
        this.year = year;
        this.hight = hight;
    }

    public static class Builder {
        private String name;
        private String year;
        private int hight;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Builder setHight(int hight) {
            this.hight = hight;
            return this;
        }

        public Person create() {
            return new Person(name, year, hight);
        }
    }
}
