package com.cent.design.abstractfactory;

//具体的红豆 轮胎产品
public class HongDouTires extends Tires{
    @Override
    public void product() {
        System.out.println("使用红豆 牌轮胎");
    }
}
