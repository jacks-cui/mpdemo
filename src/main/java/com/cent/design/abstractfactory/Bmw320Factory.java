package com.cent.design.abstractfactory;

//给宝马 320 使用 红豆发动机 和红豆 轮胎
public class Bmw320Factory implements CarFactory{
    @Override
    public Engine CreateEngine() {
        return new HongDouEngine();
    }

    @Override
    public Tires CreateTires() {
        return new HongDouTires();
    }
}
