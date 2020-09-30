package com.cent.design.abstractfactory;

//客户端调用
public class Client {
    public static void main(String[] args) {
        System.out.println("===========================>宝马320组装");
        CarFactory bmw320 = new Bmw320Factory();
        bmw320.CreateEngine().equipment();
        bmw320.CreateTires().product();

        System.out.println("===========================>宝马X5组装");
        CarFactory bmwX5 = new BmwX5Factory();
        bmwX5.CreateEngine().equipment();
        bmwX5.CreateTires().product();
    }
}
