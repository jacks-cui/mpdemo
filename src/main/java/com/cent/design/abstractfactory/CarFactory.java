package com.cent.design.abstractfactory;


//抽象的 汽车工厂 需要具体的汽车工厂去组装具体的 轮胎和 发动机
public interface  CarFactory {
    public Engine CreateEngine();

    public Tires CreateTires();
}
