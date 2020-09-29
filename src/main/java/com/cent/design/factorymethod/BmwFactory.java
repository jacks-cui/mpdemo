package com.cent.design.factorymethod;

//宝马车工厂
public class BmwFactory implements ProductFactory{
    @Override
    public CarProduct generate() {
        return new Bmw();
    }
}
