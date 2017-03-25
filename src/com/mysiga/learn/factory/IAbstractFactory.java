package com.mysiga.learn.factory;

/**
 * Created by Wilson on 2017/3/25.
 */
public interface IAbstractFactory {
    ICar createCar();

    ICar createSuperCar();
}
