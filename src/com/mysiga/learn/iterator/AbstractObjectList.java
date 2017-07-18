package com.mysiga.learn.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilson on 2017/7/18.
 */
public abstract class AbstractObjectList {
    protected List<Object> objects=new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public List<Object> getObjects() {
        return objects;
    }
    public void addObject(Object object){
        objects.add(object);
    }
    public void removeObject(Object object){
        objects.remove(object);
    }

    public abstract AbstractIterator createIterator();
}
