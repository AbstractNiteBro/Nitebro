package com.EngineeringDigest.Encapsulation.InnerClass;

public class car2{
    private final String model2;
    private boolean isEngineOn2;

    public car2(String model){
        this.model2 = model;
        this.isEngineOn2 = false;
    }

    public String getModel2() {
        return model2;
    }

    public boolean isEngineOn2() {
        return isEngineOn2;
    }

    public void setEngineOn2(boolean engineOn2) {
        isEngineOn2 = engineOn2;
    }
}
