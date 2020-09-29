package com.cent.design.factorymethod;

//火车工厂实现
public class TrainFactory implements ProductFactory{
    @Override
    public CarProduct generate() {
        return new Train();
    }
}
