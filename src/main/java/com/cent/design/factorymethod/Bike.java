package com.cent.design.factorymethod;

public class Bike implements CarProduct{
    @Override
    public void introduce() {
        System.out.println("我是自行车");
    }
}
