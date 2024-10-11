package com.EngineeringDigest.Encapsulation;

public class Student {

   private String name;
    private int age;
   private int rollNo;
    private String std;


    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name.equals("student")){
            name = "INVALID";
        }
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public void setAge(int age) {
        if(age < 1){
            age = 0;
        }
        this.age = age;

    }

    public int getAge() {
        System.out.print("Entered invalid age >>>>> ");
        return age;
    }
}

