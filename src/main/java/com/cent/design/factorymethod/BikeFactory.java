package com.cent.design.factorymethod;
//自行车工厂
public class BikeFactory implements ProductFactory{
    @Override
    public CarProduct generate() {
        return new Bike();
    }
}
