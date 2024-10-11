package com.EngineeringDigest.Encapsulation.InnerClass;

public class car {
    private String model;
     private boolean isEngineOn;

     public car(String model){
         this.model = model;
         this.isEngineOn = false;
     }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    class Engine{
        public void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model+" engine is started");
            }
            else System.out.println(model+" engine is already on");
        }
        public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model+" engine is stopped ");
            }
            else System.out.println(model+" engine is already stopped");
        }
    }

}
