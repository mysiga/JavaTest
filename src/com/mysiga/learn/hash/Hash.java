package com.mysiga.learn.hash;

/**
 * Created by Wilson on 2018/8/24.
 */
public class Hash {
    private String name;
    private int year;

    public Hash(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hash hash = (Hash) o;

        if (year != hash.year) return false;
        return name != null ? name.equals(hash.name) : hash.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }
}
