package com.mysiga.learn.iterator;

import java.util.List;

/**
 * Created by Wilson on 2017/7/18.
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
