package com.factory;

/**
 * @author XJ
 */
public class Main {
    public static void main(String[] args) {
        FactoryInterface factoryInterface = new AnhuiFactory();
        CarInterface carInterface = factoryInterface.create();
        System.out.println(carInterface.getCar());
    }
}
