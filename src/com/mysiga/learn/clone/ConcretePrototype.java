package com.mysiga.learn.clone;

import java.io.*;

/**
 * Created by Wilson on 2018/8/7.
 */
public class ConcretePrototype implements Cloneable, Serializable {

    private String attr;
    private Protot protot;

    public Protot getProtot() {
        return protot;
    }

    public void setProtot(Protot protot) {
        this.protot = protot;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public ConcretePrototype deepClone() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (ConcretePrototype) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ConcretePrototype clone() {
        Object prototype = null;
        try {
            prototype = super.clone();
            return (ConcretePrototype) prototype;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "attr='" + attr + '\'' +
                '}';
    }


    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr("where");
        System.out.println(prototype.toString());
        ConcretePrototype prototype1 = prototype.clone();
        prototype1.setAttr("where1");
        System.out.println("where1");
        System.out.println(prototype1.toString());
        System.out.println(prototype.toString());
        prototype.setAttr("where2");
        System.out.println("where2");
        System.out.println(prototype.toString());
        System.out.println(prototype1.toString());
    }

}
