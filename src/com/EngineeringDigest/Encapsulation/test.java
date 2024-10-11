package com.EngineeringDigest.Encapsulation;

public class test {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("student");
        student.setAge(-89);
        student.setRollNo(126485);
        student.setStd("12th");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollNo());
        System.out.println(student.getStd());

    }
}
