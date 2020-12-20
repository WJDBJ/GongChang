package com.factory;

/**
 * @author XJ
 */
public class MunichFactory implements FactoryInterface {
    @Override
    public CarInterface create() {
        return new ChanganBenbenCar();
    }
}
