package com.mysiga.learn.factory.method;

import com.mysiga.learn.factory.EP9Car;
import com.mysiga.learn.factory.ICar;
import com.mysiga.learn.factory.IFactory;

/**
 * factory method mode
 */
public class EP9Factory implements IFactory {

    @Override
    public ICar createCar() {
        return new EP9Car();
    }
}
