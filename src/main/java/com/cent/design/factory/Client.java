package com.cent.design.factory;

public class Client {
    public static void main(String[] args) {
        Bmw x3 = SimpleFactory.CreateCar("x3");
        x3.run();
        Bmw x5 = SimpleFactory.CreateCar("x5");
        x5.run();
    }
}
