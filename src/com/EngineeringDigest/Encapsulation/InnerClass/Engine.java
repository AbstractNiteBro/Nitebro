package com.EngineeringDigest.Encapsulation.InnerClass;

public class Engine {
    private final car2 car;

    public Engine(car2 car){
        this.car  = car;
    }

    public void start(){
        if(!car.isEngineOn2()){
            car.setEngineOn2(true);
            System.out.println(car.getModel2()+" engine is started.");
        }
        else System.out.println(car.getModel2()+" engine is already on.");
    }

    public void stop(){
        if(car.isEngineOn2()){
            car.setEngineOn2(false);
            System.out.println(car.getModel2()+" engine is stop");
        }
        else System.out.println(car.getModel2()+" engine is already stopped.");
    }
}
