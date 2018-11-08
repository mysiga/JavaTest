package com.mysiga.learn.hash;

import java.util.HashSet;

/**
 * Created by Wilson on 2018/8/24.
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Hash hash1 = new Hash("123", 123);
        Hash hash2 = new Hash("123", 123);
        System.out.println("hash1.equals(hash2)=" + hash1.equals(hash2));
        System.out.println("hash1.hashCode()==hash2.hashCode()=" + (hash1.hashCode() == hash2.hashCode()));
        HashSet hashSet=new HashSet();
        hashSet.add(hash1);
        hashSet.add(hash2);
        System.out.println("hashSet.size()="+hashSet.size());
    }
}
