package com.factory;

/**
 * @author XJ
 */
public class AnhuiFactory implements FactoryInterface {

    @Override
    public CarInterface create() {
        return new BenzCar();
    }
}
