package com.mysiga.learn.factory.abstracts;

import com.mysiga.learn.factory.EP99Car;
import com.mysiga.learn.factory.EP9Car;
import com.mysiga.learn.factory.IAbstractFactory;
import com.mysiga.learn.factory.ICar;

/**
 * abstact factory mode
 */
public class AbstractFactory implements IAbstractFactory {
    @Override
    public ICar createCar() {
        return new EP9Car();
    }

    @Override
    public ICar createSuperCar() {
        return new EP99Car();
    }
}
