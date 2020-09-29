package com.cent.design.factory;

public class SimpleFactory {
    public static Bmw CreateCar(String sign){
        switch (sign){
            case "x3" :
                return new BmwX3();
            case "x5" :
                return new BmwX5();
            default:
                break;
        }
        return null;
    }
}
