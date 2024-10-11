package com.nitesh;

public class Strings {
    public static void main (String[] args){
        // String st = new String("harry");
        String name = "Harry";
        System.out.println("the name is : ");
        System.out.print(name);
        int value = name.length();
        System.out.println(value);
        String Lcase = name.toLowerCase();
        System.out.println(Lcase);
        String Ucase = name.toUpperCase();
        System.out.println(Ucase);

        String Nontrim = "    kalnalfn   ";
        System.out.println(Nontrim);
        System.out.println(Nontrim.trim());


        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r","pp"));
        System.out.println(name.startsWith("H"));
        System.out.println(name.startsWith("r",5));
        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(4));
        String newname = "Harryrry";
        System.out.println(newname.indexOf("r"));
        System.out.println(newname.indexOf("r",4));
        System.out.println(newname.lastIndexOf("r", 4));

        System.out.println(newname.equals("Harry"));
        System.out.println(newname.equals("Harryrry"));
        System.out.println(newname.equals("harryrry"));
        System.out.println(newname.equalsIgnoreCase("harRyrrY"));

        System.out.println("hello i am nitesh \" yes sir ");



    }
}
