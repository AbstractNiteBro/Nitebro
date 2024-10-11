package com.EngineeringDigest.Encapsulation.staticNestedClass;

public class computer {
    private final String brand;
    private final String model;
    private final OperatingSystem os ;

    public OperatingSystem getOs() {
        return os;
    }

    public computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem{
        private final String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo(){
            System.out.println("Brand :"+brand+", computer model, : "+model+", OS : "+osName);
        }
    }
}
