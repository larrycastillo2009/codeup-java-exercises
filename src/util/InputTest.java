package util;

import java.util.Scanner;

public class InputTest{
    public static void main(String[] args){
        input in = new input();

        System.out.println("Type some words:");
        String larry = in.getString();
        System.out.println(larry);

        System.out.println("Yes or no?");
        boolean larry2 = in.yesNo();
        System.out.println(larry2);

        System.out.println("Enter an int between 1-10");
        int larry3 = in.getInt(1,10);
        System.out.println(larry3);

        System.out.println("Enter a double between 1.0 - 10.0");
        double larry4 = in.getDouble(1,10);
        System.out.println(larry4);

        System.out.println("get double");
        double larry5 = in.getdouble();
        System.out.println(larry5);


    }
}
