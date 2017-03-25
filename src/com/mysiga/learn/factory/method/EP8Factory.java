package com.mysiga.learn.factory.method;

import com.mysiga.learn.factory.EP8Car;
import com.mysiga.learn.factory.ICar;
import com.mysiga.learn.factory.IFactory;

/**
 * Created by Wilson on 2017/3/25.
 */
public class EP8Factory implements IFactory {
    @Override
    public ICar createCar() {
        return new EP8Car();
    }
}
