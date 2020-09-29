package com.cent.design.factorymethod;

public class Train implements CarProduct{
    @Override
    public void introduce() {
        System.out.println("我是火车");
    }
}
