package com.cent.design.abstractfactory;

//给宝马X5 装配 昆仑发动机 以及昆仑 轮胎
public class BmwX5Factory implements CarFactory{
    @Override
    public Engine CreateEngine() {
        return new KunLunEngine();
    }

    @Override
    public Tires CreateTires() {
        return new KunLunTires();
    }
}
