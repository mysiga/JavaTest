package com.mysiga.learn.factory;

import com.mysiga.learn.factory.abstracts.AbstractFactory;
import com.mysiga.learn.factory.method.EP8Factory;
import com.mysiga.learn.factory.method.EP9Factory;
import com.mysiga.learn.factory.statics.StaticFactory;

/**
 * Created by Wilson on 2017/3/25.
 */
public class FactoryTest {
    public static void main(String[] args) {
        //static factory mode
        ICar car = StaticFactory.getCar(StaticFactory.CarType.EP9);
        car.features();

        //factory method mode
        EP9Factory ep9Factory = new EP9Factory();
        ep9Factory.createCar().features();
        EP8Factory ep8Factory = new EP8Factory();
        ep8Factory.createCar().features();

        //abstract factory mode
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.createCar().features();
        abstractFactory.createSuperCar().features();
        /**
         * 1.静态工厂模式:用静态方法获取指定产品
         * 2.工厂方法模式:定义工厂接口,一个方法,让不同的子类工厂生产指定产品
         * 3.抽象工厂模式:同工厂方法模式类似,只是工厂接口有多个方法
         */
    }
}
