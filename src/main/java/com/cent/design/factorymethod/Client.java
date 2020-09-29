package com.cent.design.factorymethod;

public class Client {
    public static void main(String[] args) {
        //自行车工厂生产自行车
        ProductFactory bikeFactory = new BikeFactory();
        bikeFactory.generate().introduce();

        //宝马工厂生产 宝马车
        ProductFactory bmwFactory = new BmwFactory();
        bmwFactory.generate().introduce();

        //火车工厂生产 火车
        ProductFactory trainFactory = new TrainFactory();
        trainFactory.generate().introduce();
    }
}
